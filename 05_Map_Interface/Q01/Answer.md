# Question 01

What is the Map interface in Java, and how is it different from Collection?

## Answer

Map<K,V> stores key-value pairs. Each key is unique, but different keys can have the same value. Collection<E> stores individual elements. Map does not extend Collection; it provides views such as keySet, values, and entrySet. Example: Map<Integer,String> connects an employee ID with a name.
