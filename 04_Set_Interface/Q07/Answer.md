# Question 07

Create a TreeSet of integers and perform the following operations:
- Add elements to the set.
- Find the smallest and largest elements.
- Remove a specific element.

## Answer

The program builds a TreeSet from input, prints the sorted set, and uses first and last to find the smallest and largest values. It checks isEmpty first, because first and last cannot be called on an empty set. It then removes a requested value and prints the remaining set.

## Files and running the program

- [TreeSetOperationsDemo.java](TreeSetOperationsDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java TreeSetOperationsDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java TreeSetOperationsDemo < sample_input.txt
```
