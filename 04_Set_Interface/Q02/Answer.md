# Question 02

What is the difference between HashSet, LinkedHashSet, and TreeSet in Java?

## Answer

HashSet uses hashing and has no guaranteed iteration order; basic operations are expected O(1) with suitable hashes. LinkedHashSet also uses hashing and keeps insertion order, with extra links and memory. TreeSet stores elements in sorted order using a balanced tree, and basic operations are O(log n). TreeSet uses natural order or a Comparator and treats a comparison result of zero as a duplicate.
