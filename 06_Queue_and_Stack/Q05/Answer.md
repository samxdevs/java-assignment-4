# Question 05

Write a program to check if a string is a palindrome using a Deque.

## Answer

The program puts the input characters in an ArrayDeque<Character>, then compares and removes the front and back until at most one character remains. Any mismatch means the string is not a palindrome. This version compares the exact text, including case, spaces, and punctuation. Empty and one-character strings are palindromes.

## Files and running the program

- [PalindromeDemo.java](PalindromeDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java PalindromeDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java PalindromeDemo < sample_input.txt
```
