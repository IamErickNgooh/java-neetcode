package arraysHashing.easy;

public class ConcatenationofArray { 
    public static int[] getConcatenation(int[] nums) {
        int doubleLen = nums.length * 2;
        int[] ans = new int[doubleLen];

        for (int i = 0; i < doubleLen; i++)
            ans[i] = nums[i % nums.length];

        return ans;
    }
}