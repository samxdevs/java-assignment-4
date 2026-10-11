# Question 03

How do bounded type parameters work in generics? Write a generic class that accepts only subclasses of Number.

## Answer

A bound limits the types allowed for a type parameter. `class NumberBox<T extends Number>` accepts Number and its subclasses, such as Integer and Double. It rejects String. The bound also allows the class to call Number methods such as `doubleValue()`. Here, extends is used for both class bounds and interface bounds.

## Files and running the program

- [BoundedTypeDemo.java](BoundedTypeDemo.java)
- [NumberBox.java](NumberBox.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java BoundedTypeDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java BoundedTypeDemo < sample_input.txt
```
