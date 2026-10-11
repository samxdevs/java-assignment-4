# Question 06

Write a generic class Pair<K, V> that holds two values of any types, K and V. Include methods to get and set the values.

## Answer

Pair<K, V> uses two independent type parameters. Its constructor stores both values, and getters and setters read or update them. The demo uses Pair<String, Integer> for a name and age, then asks for replacement values.

## Files and running the program

- [Pair.java](Pair.java)
- [PairDemo.java](PairDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java PairDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java PairDemo < sample_input.txt
```
