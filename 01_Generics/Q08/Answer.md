# Question 08

Write a generic method swapElements that swaps two elements in an array. Demonstrate its usage with different data types.

## Answer

The method declares `<T>` before its return type: `public static <T> void swapElements(T[] array, int first, int second)`. A temporary variable holds one element during the swap. The demo accepts Integer and String arrays and uses zero-based indexes. Bounds checks prevent invalid positions from being used. Generic arrays here use Integer[], because primitive int[] does not match T[].

## Files and running the program

- [SwapDemo.java](SwapDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java SwapDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java SwapDemo < sample_input.txt
```
