# Question 07

What is the difference between Collection and Map interfaces in Java?

## Answer

Collection<E> stores individual elements, such as names. Map<K,V> stores associations between unique keys and values, such as employee ID to employee name. Map is not a subtype of Collection. A Map can expose collection views through keySet(), values(), and entrySet(). Values can repeat, but putting an existing key replaces its value.
