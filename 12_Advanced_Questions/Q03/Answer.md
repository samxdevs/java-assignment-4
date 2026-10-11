# Question 03

Use a WeakHashMap to demonstrate how entries are garbage-collected when keys are no longer strongly referenced.

## Answer

The program retains one key and releases another by setting its strong reference to null. A WeakReference tracks the released key. It requests garbage collection a limited number of times and accesses the WeakHashMap to allow stale entries to be removed. System.gc is only a request: collection is not guaranteed, so the program reports either observation honestly. A strongly retained key should remain. The keys are custom objects, which avoids String interning affecting the demonstration.

## Files and running the program

- [WeakHashMapDemo.java](WeakHashMapDemo.java)
- [WeakKey.java](WeakKey.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java WeakHashMapDemo
```

This demonstration does not need keyboard input.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java WeakHashMapDemo < sample_input.txt
```

Timing, random order, thread observations, HashMap/HashSet order, or garbage-collection output may differ between runs where applicable.
