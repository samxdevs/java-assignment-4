# Question 01

What is the purpose of generics in Java, and how do they improve type safety and code reusability?

## Answer

Generics let a class, interface, or method work with a type chosen by its caller. For example, `ArrayList<String>` stores strings. The compiler rejects adding an integer, so many type mistakes are caught before the program runs. One generic class can work with String, Integer, and other reference types, which avoids repeating the same code. Generics also reduce the need for casts. Use wrapper types such as Integer instead of primitive types such as int.
