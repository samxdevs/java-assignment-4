# Question 12

Write a generic method to print all elements of any Collection (e.g., List, Set, Queue).

## Answer

`public static <T> void printElements(Collection<T> items)` accepts collections of different element types. An enhanced for loop prints each element. The program demonstrates a List, a LinkedHashSet, and a LinkedList used as a Queue. The set removes duplicates; the list and queue preserve them.

## Files and running the program

- [PrintCollectionDemo.java](PrintCollectionDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java PrintCollectionDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java PrintCollectionDemo < sample_input.txt
```
