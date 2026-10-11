# Question 02

Write a program to implement a simple banking system using Map to store customer IDs and their account balances.

## Answer

The menu maps customer IDs to BigDecimal balances. It supports account creation, deposit, withdrawal, checking a balance, and displaying accounts. IDs must be unique; missing accounts and nonpositive amounts are rejected. Withdrawals cannot exceed the balance. BigDecimal is created directly from decimal text and amounts must have at most two decimal places, avoiding binary floating-point rounding for money. This is an in-memory classroom example.

## Files and running the program

- [BankingApp.java](BankingApp.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java BankingApp
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java BankingApp < sample_input.txt
```

Timing, random order, thread observations, HashMap/HashSet order, or garbage-collection output may differ between runs where applicable.
