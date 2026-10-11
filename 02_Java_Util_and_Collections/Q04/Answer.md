# Question 04

What is the role of the Iterator interface in the java.util package?

## Answer

Iterator<E> visits elements without requiring indexes. hasNext checks whether another element is available, and next returns it. Where supported, iterator.remove safely removes the last returned element during traversal. Example: `Iterator<Integer> it = numbers.iterator(); while (it.hasNext()) { System.out.println(it.next()); }`. Most ordinary collection iterators are fail-fast on unexpected structural changes; this is a best-effort bug check, not thread safety.
