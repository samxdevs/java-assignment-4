# Java Module 4 — Complete Solutions

All **81 questions** are answered in the assignment's order, in **12 sections**. There are **47 runnable programs** and **34 theory-only answers**.

## Start here

1. Open a section below, then its question folder (Q01, Q02, etc.).
2. Read **Answer.md** for the original question and a short explanation.
3. Open the **.java** files to study the code. Generic classes such as Pair, Box, Stack, and MultiMap have their own files beside their demo.
4. Use **sample_input.txt** and **sample_output.txt** to see an example run.

[ALL_ANSWERS.md](ALL_ANSWERS.md) puts all 81 explanations in one place and links to each question's files. Question numbers restart within each section. Sub-bullets in the original assignment are included with their parent question.

## Run a question

Java JDK 8 or later is required. The programs use Java 8-compatible syntax and APIs and were checked with the installed JDK 24.0.1.

Clone the repository, then run a question from Terminal:

```sh
git clone https://github.com/samxdevs/java-assignment-4.git
cd java-assignment-4
bash run.sh 1 6
```

The two numbers mean **section 1, question 6** (Pair). For the to-do application, use `bash run.sh 11 2`. The launcher compiles into a temporary folder and deletes it after the program exits.

If you already have the files locally, open Terminal in the solutions folder and run `bash run.sh 1 6` directly.

To replay a sample through the launcher:

```sh
bash run.sh 1 6 < 01_Generics/Q06/sample_input.txt
```

You can also open a question folder and use the exact `javac *.java` and `java ClassName` commands in its Answer.md. In an IDE, open the question folder and run its demo class. Each question is independent and needs only the standard Java library.

## Input and behavior

- Type one answer for each prompt. Whole-number prompts retry invalid text. Count prompts allow 0 to 10000 items.
- List/array indexes start at 0. The to-do menu displays task numbers starting at 1.
- Menu programs keep running until you choose **0**.
- String ordering and matching are case-sensitive. The palindrome program compares the exact input, including spaces and punctuation.
- Application data stays in memory during a run. Relaunching starts with empty data.
- HashMap/HashSet order, shuffling, timing, and thread observations can differ from the samples. The WeakHashMap demo honestly reports whether garbage collection was observed.

## Sections

1. [Generics](01_Generics/README.md)
2. [Java.util package and collection framework](02_Java_Util_and_Collections/README.md)
3. [List Interface](03_List_Interface/README.md)
4. [Set Interface](04_Set_Interface/README.md)
5. [Map Interface](05_Map_Interface/README.md)
6. [Queue and stack](06_Queue_and_Stack/README.md)
7. [Specialized Classes](07_Specialized_Classes/README.md)
8. [Concurrency and Thread-Safety](08_Concurrency_and_Thread_Safety/README.md)
9. [Utility Methods in Collections Class](09_Collections_Utility_Methods/README.md)
10. [Custom Comparator](10_Custom_Comparator/README.md)
11. [Practical Use Cases](11_Practical_Use_Cases/README.md)
12. [Advanced Questions](12_Advanced_Questions/README.md)

## Verification and references

[VERIFICATION.txt](VERIFICATION.txt) records the compilation and behavior checks. Sample output files were captured from actual runs. Compiler outputs were kept in temporary folders.

The explanations were checked against official Java references, including the [generics tutorial](https://docs.oracle.com/javase/tutorial/java/generics/wildcards.html), [HashMap](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/HashMap.html), [ConcurrentHashMap](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/concurrent/ConcurrentHashMap.html), and [WeakHashMap](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/WeakHashMap.html).
