# Question 02

Write a program to shuffle and sort an ArrayList using methods from the Collections class.

## Answer

The program reads an ArrayList of integers, prints it, shuffles it with Collections.shuffle, and then sorts it with Collections.sort. A shuffle can occasionally leave the order unchanged; it is still a valid random shuffle.

## Files and running the program

- [ShuffleSortDemo.java](ShuffleSortDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java ShuffleSortDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java ShuffleSortDemo < sample_input.txt
```

Timing, random order, thread observations, HashMap/HashSet order, or garbage-collection output may differ between runs where applicable.
