# Question 01

What is the purpose of the PriorityQueue class in Java?

## Answer

PriorityQueue stores elements according to natural order or a Comparator, so peek and poll access the least element under that order. To model highest importance, define a comparator with the intended priority rule. offer and poll take O(log n), and peek takes O(1). Iteration is not sorted, ties have no general FIFO guarantee, and null elements are not allowed.
