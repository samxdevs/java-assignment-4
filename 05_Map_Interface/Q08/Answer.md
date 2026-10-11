# Question 08

Write a program to show the difference between HashMap and LinkedHashMap in terms of iteration order.

## Answer

The same user-entered entries are added to a HashMap and a LinkedHashMap. LinkedHashMap iteration follows insertion order; HashMap order is unspecified. A particular HashMap may happen to print the same order, which does not establish an ordering guarantee. Updating an existing LinkedHashMap key normally leaves it in its original insertion position.

## Files and running the program

- [MapOrderDemo.java](MapOrderDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java MapOrderDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java MapOrderDemo < sample_input.txt
```

Timing, random order, thread observations, HashMap/HashSet order, or garbage-collection output may differ between runs where applicable.
