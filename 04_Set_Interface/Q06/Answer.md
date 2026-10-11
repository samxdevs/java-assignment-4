# Question 06

Write a program to demonstrate the uniqueness property of HashSet by attempting to add duplicate elements.

## Answer

The program prints the boolean returned by HashSet.add for each user-entered string. The first occurrence returns true; a later equal string returns false. The final size counts only unique strings. String matching is case-sensitive, so "Apple" and "apple" differ.

## Files and running the program

- [HashSetUniquenessDemo.java](HashSetUniquenessDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java HashSetUniquenessDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java HashSetUniquenessDemo < sample_input.txt
```

Timing, random order, thread observations, HashMap/HashSet order, or garbage-collection output may differ between runs where applicable.
