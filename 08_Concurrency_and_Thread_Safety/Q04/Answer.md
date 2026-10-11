# Question 04

Create a ConcurrentHashMap and demonstrate how it handles concurrent modifications.

## Answer

Two threads increment the same counter in a ConcurrentHashMap using merge, which makes each per-key increment atomic. Another thread iterates while updates occur. Iteration is weakly consistent and may show an intermediate value without throwing ConcurrentModificationException. After all joins, the final counter must equal twice the increments per worker.

## Files and running the program

- [ConcurrentMapDemo.java](ConcurrentMapDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java ConcurrentMapDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java ConcurrentMapDemo < sample_input.txt
```

Timing, random order, thread observations, HashMap/HashSet order, or garbage-collection output may differ between runs where applicable.
