# Question 05

How do raw types differ from parameterized types in generics, and why should raw types be avoided?

## Answer

A parameterized type specifies the element type: `List<String> names = new ArrayList<>();`. A raw type leaves it out: `List names = new ArrayList();`. Raw types disable useful generic checks and can cause unchecked warnings or a ClassCastException later. Avoid them in new code. For example, a raw list can hold both a string and an integer, while List<String> rejects the integer at compile time.
