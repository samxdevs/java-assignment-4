# Question 04

Create an unmodifiable List using Collections.unmodifiableList() and show what happens when you try to modify it.

## Answer

Collections.unmodifiableList returns a read-only view of an existing list. Adding, removing, or replacing through that view throws UnsupportedOperationException. The program catches that exception and also changes the backing list to show that the view reflects backing-list updates. The wrapper does not make contained objects immutable.

## Files and running the program

- [UnmodifiableListDemo.java](UnmodifiableListDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java UnmodifiableListDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java UnmodifiableListDemo < sample_input.txt
```
