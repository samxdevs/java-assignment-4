# Question 03

Write a program to count the frequency of characters in a string using a HashMap.

## Answer

The program scans the input one char at a time and uses a HashMap<Character,Integer> to count occurrences. Spaces, punctuation, and letter case are included. It sorts a copy of the keys only for readable output. char represents a UTF-16 code unit, so some emoji or other supplementary Unicode characters occupy two char entries.

## Files and running the program

- [CharacterFrequencyDemo.java](CharacterFrequencyDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java CharacterFrequencyDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java CharacterFrequencyDemo < sample_input.txt
```
