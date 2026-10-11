# Question 02

Explain the syntax for creating a user-defined generic class in Java. Provide an example.

## Answer

Declare a type parameter in angle brackets after the class name: `class Container<T>`. Use T as the type of fields, parameters, and return values. Create an object with an actual type, for example `Container<String> name = new Container<>();`. In the program, the same Container class stores a user-entered string and integer.

## Files and running the program

- [Container.java](Container.java)
- [GenericClassDemo.java](GenericClassDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java GenericClassDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java GenericClassDemo < sample_input.txt
```
