# NeetCode Solutions in Java

Ce dépôt contient mes solutions aux problèmes de la roadmap [NeetCode](https://neetcode.io/roadmap), implémentées en **Java**, avec des **tests unitaires** via **JUnit 5**.

## Objectifs

- Maîtriser les algorithmes et les structures de données
- Améliorer mes compétences en Java
- Pratiquer les tests unitaires (JUnit)
- Approfondir ma connaissance de Git et GitHub (issues, branches, PR, workflows)


## Structure du dépôt

- `src/theme/main/niveau/` → Code source des solutions
- `src/theme/test/niveau/` → Tests unitaires associés
- `src/theme/solution/niveau/` → Explications des solutions (format Markdown)
- Problèmes classés par **difficulté** (`Easy`, `Medium`, `Hard`) et **thématique**

### Exemple :
```bash
src/
├── ArraysHashing/main/easy/TwoSum.java
├── ArraysHashing/test/easy/TwoSumTest.java
└── ArraysHashing/solution/easy/TwoSumSolution.md
```

## Workflow Git & GitHub

1. Créer une **issue** pour chaque problème
2. Créer une branche dédiée :  
   `git checkout -b feat/#12-two-sum`
3. Développer la solution avec tests unitaires personnalisés
4. Pousser la branche :  
   `git push origin feat/#12-two-sum`
5. Créer une **Pull Request** avec `Closes #12` dans la description
6. Merger la PR après relecture (même si je travaille seul)


## Auteur

Projet personnel réalisé par @IamErickNgooh pour apprendre Java sérieusement et progresser en algorithmie avec rigueur.