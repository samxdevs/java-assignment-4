# Question 09

What is the significance of the Iterable interface, and how is it used in the Collection Framework?

## Answer

Iterable<E> defines iterator(), which supplies a way to visit elements. Since Collection extends Iterable, lists, sets, and queues can be used in an enhanced for loop: `for (String name : names) { System.out.println(name); }`. Map itself is not Iterable, but its keySet, values, and entrySet views are.
