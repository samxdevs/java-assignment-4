# Question 08

Write a program to iterate over a LinkedHashSet and explain its order-preserving property.

## Answer

LinkedHashSet preserves the order in which distinct elements were first added. Adding a duplicate does not move it to the end. The program iterates with an enhanced for loop; for input red, blue, red, green, it prints red, blue, green.

## Files and running the program

- [LinkedHashSetDemo.java](LinkedHashSetDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java LinkedHashSetDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java LinkedHashSetDemo < sample_input.txt
```
