# Question 01

Create a generic MultiMap<K, V> class that stores multiple values for a single key using a HashMap<K, List<V>>.

## Answer

MultiMap<K,V> keeps a HashMap<K,List<V>>. put creates an ArrayList the first time a key appears, then appends the value. get returns a copy of the values, so callers cannot accidentally change the internal list. Missing keys return an empty list. Duplicate values are allowed, and HashMap key order is not guaranteed.

## Files and running the program

- [MultiMap.java](MultiMap.java)
- [MultiMapDemo.java](MultiMapDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java MultiMapDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java MultiMapDemo < sample_input.txt
```

Timing, random order, thread observations, HashMap/HashSet order, or garbage-collection output may differ between runs where applicable.
