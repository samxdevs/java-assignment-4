# Question 02

What is the difference between HashMap, LinkedHashMap, and TreeMap?

## Answer

HashMap uses hashing and has no guaranteed iteration order. LinkedHashMap normally keeps insertion order and can also be configured to keep access order. TreeMap sorts by key using natural order or a Comparator. HashMap and LinkedHashMap have expected O(1) basic operations with suitable hashes, while TreeMap has O(log n) basic operations. Reusing a key updates its value.
