# Question 02

Use a PriorityQueue to store a list of tasks with priorities. Add tasks, remove the highest-priority task, and print the queue.

## Answer

Each Task has a description and numeric priority. The comparator treats a smaller number as higher priority and uses input order to break ties. poll removes the highest-priority task. PriorityQueue iteration is not sorted, so the program prints priority order by polling a copy, leaving the original queue intact.

## Files and running the program

- [PriorityTasksDemo.java](PriorityTasksDemo.java)
- [Task.java](Task.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java PriorityTasksDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java PriorityTasksDemo < sample_input.txt
```
