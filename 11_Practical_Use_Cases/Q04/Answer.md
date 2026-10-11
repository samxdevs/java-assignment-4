# Question 04

Create a program to store students’ grades in a TreeMap, with student names as keys and grades as values. Allow adding, removing, and querying grades.

## Answer

TreeMap<String,String> stores student names and grades. The menu allows adding or updating a grade, removing a student, querying a grade, and displaying all students. Keys use natural, case-sensitive name order. An existing name has its grade replaced. Data is stored in memory for the current run.

## Files and running the program

- [StudentGradesApp.java](StudentGradesApp.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java StudentGradesApp
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java StudentGradesApp < sample_input.txt
```
