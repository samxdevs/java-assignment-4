# Question 05

Write a program to merge two PriorityQueue objects and sort the resulting queue.

## Answer

The program reads two PriorityQueue<Integer> objects, adds both into a new queue, and repeatedly polls the merged queue to print ascending order. Duplicate numbers remain. A PriorityQueue's normal iterator is not sorted, so polling is necessary for ordered output.

## Files and running the program

- [MergePriorityQueuesDemo.java](MergePriorityQueuesDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java MergePriorityQueuesDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java MergePriorityQueuesDemo < sample_input.txt
```
