# Question 01

Write a program to sort a list of custom objects (e.g., Student with name and marks) using a Comparator.

## Answer

Student stores a name and marks. A Comparator sorts students by marks in descending order, then by name for a tie. The program uses an anonymous Comparator class so the comparison steps are visible. Integer.compare avoids subtraction-based overflow.

## Files and running the program

- [Student.java](Student.java)
- [StudentComparatorDemo.java](StudentComparatorDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java StudentComparatorDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java StudentComparatorDemo < sample_input.txt
```
