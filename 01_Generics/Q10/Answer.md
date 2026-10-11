# Question 10

Implement a generic class MinMaxFinder<T extends Comparable<T>> that provides methods findMin() and findMax() to find the minimum and maximum elements in a list. Demonstrate it with a list of integers and strings.

## Answer

`T extends Comparable<T>` requires elements that can compare themselves using compareTo. findMin and findMax start with the first element, scan the list, and update the result when a smaller or larger element is found. The class rejects an empty list because an empty list has no minimum or maximum. Integer uses numeric order; String uses natural, case-sensitive lexicographic order.

## Files and running the program

- [MinMaxDemo.java](MinMaxDemo.java)
- [MinMaxFinder.java](MinMaxFinder.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java MinMaxDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java MinMaxDemo < sample_input.txt
```
