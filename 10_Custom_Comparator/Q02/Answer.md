# Question 02

Write a program to sort a Map by its values using a custom Comparator.

## Answer

A Map does not generally sort its entries by value. The program copies entrySet into an ArrayList and sorts entries by ascending value with a Comparator, breaking ties by key. It inserts the sorted entries into a LinkedHashMap to preserve that display order. Equal values are all retained; sorting by value does not remove entries.

## Files and running the program

- [MapValueSortDemo.java](MapValueSortDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java MapValueSortDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java MapValueSortDemo < sample_input.txt
```
