# Question 04

What is the difference between ? extends T and ? super T in generics? Provide an example of when to use each.

## Answer

`? extends T` means T or an unknown subtype of T. Use it when reading values as T, such as summing a List of Integer or Double through `List<? extends Number>`. You cannot safely add a non-null value because the exact element type is unknown. `? super T` means T or an unknown supertype of T. Use it when adding T values, such as adding integers to `List<? super Integer>`. Reading from that list gives Object. The program demonstrates both cases.

## Files and running the program

- [WildcardDemo.java](WildcardDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java WildcardDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java WildcardDemo < sample_input.txt
```
