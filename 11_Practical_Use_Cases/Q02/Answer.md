# Question 02

Implement a basic to-do list application using ArrayList to store tasks. Add functionality to add, remove, and display tasks.

## Answer

The menu stores tasks in ArrayList<String>. Users can add a task, display numbered tasks, or remove a task by its displayed number. The program converts the one-based task number to a zero-based list index and validates it. Tasks are kept in memory for the current run.

## Files and running the program

- [TodoListApp.java](TodoListApp.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java TodoListApp
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java TodoListApp < sample_input.txt
```
