# Question 06

Write a program to create a HashMap of employee IDs and names. Perform the following operations:
- Add new key-value pairs.
- Check if a key exists.
- Iterate through the map using:
- KeySet
- EntrySet

## Answer

The program reads employee IDs and names into a HashMap, checks a user-entered ID with containsKey, and prints entries first through keySet plus get, then through entrySet. Employee IDs are unique: adding an existing ID updates its name. HashMap iteration order is not guaranteed.

## Files and running the program

- [EmployeeMapDemo.java](EmployeeMapDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java EmployeeMapDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java EmployeeMapDemo < sample_input.txt
```

Timing, random order, thread observations, HashMap/HashSet order, or garbage-collection output may differ between runs where applicable.
