# Question 07

Create a user-defined generic class Box<T> with methods addItem(T item) and getItem(). Demonstrate its usage with String and Integer types.

## Answer

Box<T> stores one item. `addItem(T item)` saves or replaces that item, and `getItem()` returns it. The demo creates Box<String> and Box<Integer> and fills both from keyboard input. Before an item is added, this simple box contains null.

## Files and running the program

- [Box.java](Box.java)
- [BoxDemo.java](BoxDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java BoxDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java BoxDemo < sample_input.txt
```
