# Question 04

Create a program to implement a book catalog system using HashMap, where book titles are the keys and author names are the values. Allow searching by title.

## Answer

HashMap<String,String> maps book titles to author names. The menu allows adding or updating books, searching by an exact title, and displaying the catalog. Titles are case-sensitive. Adding an existing title replaces its author. HashMap display order is not guaranteed, and the catalog exists only during the current run.

## Files and running the program

- [BookCatalogApp.java](BookCatalogApp.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java BookCatalogApp
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java BookCatalogApp < sample_input.txt
```

Timing, random order, thread observations, HashMap/HashSet order, or garbage-collection output may differ between runs where applicable.
