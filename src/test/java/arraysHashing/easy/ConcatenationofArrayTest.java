package arraysHashing.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ConcatenationofArrayTest {

    void verboseTest(String testName, int[] input, int[] expected) {
        int[] result = ConcatenationofArray.getConcatenation(input);
        System.out.println("==== TEST: " + testName + " ====");
        System.out.println("Input    : " + Arrays.toString(input));
        System.out.println("Expected : " + Arrays.toString(expected));
        System.out.println("Result   : " + Arrays.toString(result));
        System.out.println("Status   : " + (Arrays.equals(result, expected) ? "✅ PASS" : "❌ FAIL"));
        System.out.println();
        assertArrayEquals(expected, result);
    }

    @Test
    void testEmptyArray() {
        verboseTest("Empty array", new int[] {}, new int[] {});
    }

    @Test
    void testSingleElement() {
        verboseTest("Single element", new int[] {42}, new int[] {42, 42});
    }

    @Test
    void testTwoElements() {
        verboseTest("Two elements", new int[] {1, 2}, new int[] {1, 2, 1, 2});
    }

    @Test
    void testAllZeroes() {
        verboseTest("All zeroes", new int[] {0, 0, 0}, new int[] {0, 0, 0, 0, 0, 0});
    }

    @Test
    void testNegativeValues() {
        verboseTest("Negative values", new int[] {-1, -2, -3}, new int[] {-1, -2, -3, -1, -2, -3});
    }

    @Test
    void testWithMaxInt() {
        int max = Integer.MAX_VALUE;
        verboseTest("Max int values", new int[] {max, 0}, new int[] {max, 0, max, 0});
    }

    @Test
    void testStructureRespected() {
        int[] input = {7, 8, 9};
        int[] expected = {7, 8, 9, 7, 8, 9};
        verboseTest("Structure verification", input, expected);
    }

    @Test
    void testLargeArray() {
        int[] input = new int[1000];
        for (int i = 0; i < input.length; i++) input[i] = i;
        int[] expected = new int[2000];
        for (int i = 0; i < expected.length; i++) expected[i] = input[i % input.length];

        verboseTest("Large array", input, expected);
    }
}
