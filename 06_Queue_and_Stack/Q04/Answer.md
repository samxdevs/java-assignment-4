# Question 04

Implement a deque using the ArrayDeque class. Perform operations like:
- Add elements at both ends.
- Remove elements from both ends.
- Peek at both ends.

## Answer

ArrayDeque implements Deque. The program uses addFirst and addLast to add at both ends, peekFirst and peekLast to inspect them, and pollFirst and pollLast to remove from both ends. Peek and poll return null when empty. ArrayDeque does not permit null elements.

## Files and running the program

- [ArrayDequeDemo.java](ArrayDequeDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java ArrayDequeDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java ArrayDequeDemo < sample_input.txt
```
