# Question 08

Write a program to sort an ArrayList of strings alphabetically and reverse alphabetically.

## Answer

Collections.sort puts the strings in natural order. Collections.sort with Collections.reverseOrder puts them in reverse natural order. Java's natural String ordering is case-sensitive, so using the same letter case makes the alphabetical result easier to see.

## Files and running the program

- [SortStringsDemo.java](SortStringsDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java SortStringsDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java SortStringsDemo < sample_input.txt
```
