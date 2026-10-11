# Question 02

Write a program to demonstrate the thread-safe nature of Vector by adding elements to it from multiple threads.

## Answer

The program starts two threads that add disjoint ranges of integers to one Vector. It joins both threads before printing the expected and actual size. A matching count demonstrates that concurrent individual add calls are retained. Element order depends on thread scheduling, so the program checks the count rather than promising a fixed order.

## Files and running the program

- [VectorThreadDemo.java](VectorThreadDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java VectorThreadDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java VectorThreadDemo < sample_input.txt
```

Timing, random order, thread observations, HashMap/HashSet order, or garbage-collection output may differ between runs where applicable.
