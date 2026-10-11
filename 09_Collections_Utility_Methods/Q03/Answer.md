# Question 03

How can you make a collection thread-safe using the Collections class?

## Answer

Use wrappers such as Collections.synchronizedList(new ArrayList<>()), synchronizedSet, or synchronizedMap. All access to the underlying structure should go through the wrapper. For iteration, synchronize on the returned wrapper: `synchronized (list) { for (String item : list) { System.out.println(item); } }`. Compound operations also need explicit synchronization when they must happen together.
