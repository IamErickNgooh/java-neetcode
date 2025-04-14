# Concatenation of Array – Solution Java

Ce fichier contient la solution à l'exercice **"Concatenation of Array"**, issu du module **Arrays & Hashing** de NeetCode.

Objectif :  
Étant donné un tableau `nums`, retourner un nouveau tableau qui est la **concaténation de `nums` avec lui-même**.

Exemple :
```java
Input:  [1, 2, 1]
Output: [1, 2, 1, 1, 2, 1]
```

---

## Partie 1 – Le principe du modulo et des cycles

### 🔹 Qu’est-ce que le modulo ?

Le **modulo** (`%`) donne le **reste** d’une division.

Exemples :

```java
5 % 3 = 2   // car 5 = 1×3 + 2
7 % 4 = 3   // car 7 = 1×4 + 3
6 % 6 = 0   // car 6 = 1×6 + 0
```

---

### Le modulo crée un **cycle**

Si on fait `i % n` en répétant `i`, les résultats forment un cycle de `0` à `n - 1`.

Exemple avec `n = 3` :

```
i        : 0 1 2 3 4 5 6 7 8
i % 3    : 0 1 2 0 1 2 0 1 2 ← cycle !
```

✅ Cela permet de **boucler sur un tableau** sans jamais dépasser sa taille.

---

## Partie 2 – Application à notre solution

Voici le code de la solution :

```java
public static int[] getConcatenation(int[] nums) {
    int doubleLen = nums.length * 2;
    int[] ans = new int[doubleLen];

    for (int i = 0; i < doubleLen; i++)
        ans[i] = nums[i % nums.length];

    return ans;
}
```

### Explication pas à pas :

- On crée un tableau `ans` **de deux fois la taille de `nums`**
- Ensuite on remplit ce tableau avec une **copie de `nums`, deux fois de suite**
- Pour y parvenir, on utilise le **modulo** pour **revenir au début de `nums` automatiquement** :

#### Exemple :

Pour `nums = [1, 2, 1]`, taille = 3  
On fait un tableau `ans` de taille `6` (2 × 3)

| i   | i % 3 | nums[i % 3] | ans[i] |
|-----|-------|-------------|--------|
| 0   | 0     | 1           | 1      |
| 1   | 1     | 2           | 2      |
| 2   | 2     | 1           | 1      |
| 3   | 0     | 1           | 1      |
| 4   | 1     | 2           | 2      |
| 5   | 2     | 1           | 1      |

Le `i % nums.length` crée un cycle sur les indices de `nums`, ce qui nous permet de le **copier 2 fois automatiquement** sans boucle complexe.

---

## Avantages de cette méthode

- Aucun tableau temporaire nécessaire
- Code **ultra simple et efficace**
- Utilise intelligemment le **modulo comme générateur de boucle cyclique**

---

## Résumé

> Le **modulo permet de créer des cycles**. Ici, on l’utilise pour **parcourir `nums` deux fois** en boucle dans un tableau plus grand.
> C’est un pattern simple, mais puissant, qu’on retrouve souvent en algorithmie.
