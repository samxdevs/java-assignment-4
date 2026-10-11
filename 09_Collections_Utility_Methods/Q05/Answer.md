# Question 05

Write a program to perform a binary search on a List using the Collections.binarySearch() method.

## Answer

The program sorts the entered list before calling Collections.binarySearch. A nonnegative result is a zero-based index where the value was found; for duplicates, any matching index may be returned. A negative result encodes the insertion point as `-(result + 1)`. This is where the missing value could be inserted while preserving sorted order.

## Files and running the program

- [BinarySearchDemo.java](BinarySearchDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java BinarySearchDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java BinarySearchDemo < sample_input.txt
```
