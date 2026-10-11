# Question 06

Write a program to find the frequency of elements in a list using Collections.frequency().

## Answer

Collections.frequency counts elements equal to a specified value. The program reads a list of strings and a target string, then prints the count. Matching is case-sensitive, and a missing target has frequency zero.

## Files and running the program

- [FrequencyDemo.java](FrequencyDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java FrequencyDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java FrequencyDemo < sample_input.txt
```
