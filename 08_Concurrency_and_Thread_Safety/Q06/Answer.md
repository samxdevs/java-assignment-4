# Question 06

Write a program using CopyOnWriteArrayList to iterate and modify a list safely in a multithreaded environment.

## Answer

The program creates an iterator before starting a reader thread and a writer thread. The writer adds one value and removes another while the reader visits the original snapshot. CountDownLatch starts both workers together without sleep-based timing. After joining, the program prints the updated list. The old iterator still visits the original elements safely, and thread-output order may vary.

## Files and running the program

- [CopyOnWriteDemo.java](CopyOnWriteDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java CopyOnWriteDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java CopyOnWriteDemo < sample_input.txt
```

Timing, random order, thread observations, HashMap/HashSet order, or garbage-collection output may differ between runs where applicable.
