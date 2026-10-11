# Question 06

What are the key interfaces in the Java Collection Framework, and how are they related?

## Answer

Iterable<E> provides iterator(). Collection<E> extends Iterable<E>; List<E>, Set<E>, and Queue<E> extend Collection<E>. Deque<E> extends Queue<E>. SortedSet extends Set, and NavigableSet extends SortedSet. Map<K,V> is separate: SortedMap extends Map and NavigableMap extends SortedMap. Examples include ArrayList for List, HashSet for Set, LinkedList for Queue, and ArrayDeque for Deque.
