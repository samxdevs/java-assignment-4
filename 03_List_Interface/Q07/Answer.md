# Question 07

Write a program to compare the performance of ArrayList and LinkedList for:
- Adding elements at the beginning.
- Removing elements from the middle.
- Iterating through the list.

## Answer

The program times inserting at index 0, repeatedly removing at the current middle index, and iterating through equal-sized lists. Setup is outside the measured removal and iteration blocks. Both lists use the same values and operations. LinkedList can add at the beginning quickly, but remove(index) still needs traversal. Timing varies with warm-up, garbage collection, and the computer, so this is a classroom demonstration rather than a reliable benchmark. Traversal uses enhanced for loops to avoid repeated indexed access on LinkedList.

## Files and running the program

- [ListPerformanceDemo.java](ListPerformanceDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java ListPerformanceDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java ListPerformanceDemo < sample_input.txt
```

Timing, random order, thread observations, HashMap/HashSet order, or garbage-collection output may differ between runs where applicable.
