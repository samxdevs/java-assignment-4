# Question 09

Develop a user-defined generic class Stack<T> that provides standard stack operations like push(T item), pop(), and peek(). Demonstrate with integers and strings.

## Answer

The custom Stack<T> stores items in an ArrayList<T>. push adds at the end, pop removes the last item, and peek reads the last item without removing it. This gives last-in, first-out (LIFO) behavior. pop and peek throw EmptyStackException when the stack is empty; the demo checks isEmpty before calling them. Both integers and strings are demonstrated.

## Files and running the program

- [GenericStackDemo.java](GenericStackDemo.java)
- [Stack.java](Stack.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java GenericStackDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java GenericStackDemo < sample_input.txt
```
