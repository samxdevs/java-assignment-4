# Question 06

Create a List of strings and perform the following operations:
- Add elements to the list.
- Remove an element by value and index.
- Replace an element at a specific index.
- Print the list after each operation.

## Answer

The program reads a string list and prints it after each add. It then removes by value, removes by a zero-based index, and replaces an element using set. Each stage prints the result, and index checks handle an empty list or invalid position.

## Files and running the program

- [ListOperationsDemo.java](ListOperationsDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java ListOperationsDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java ListOperationsDemo < sample_input.txt
```
