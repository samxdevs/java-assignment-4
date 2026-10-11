# Question 04

How does HashSet handle duplicate elements? Explain with an example.

## Answer

HashSet uses hashCode to find a bucket and equals to check equality among candidate elements. add returns false for an element equal to one already present, leaving the set unchanged. Example: adding "apple", "banana", and "apple" gives a set with size 2. The display order is not guaranteed.
