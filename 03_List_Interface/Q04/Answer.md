# Question 04

What is the role of the Vector class, and how does it differ from ArrayList?

## Answer

Vector is a resizable-array List whose individual methods are synchronized. ArrayList is also a resizable-array List, but its methods are not synchronized and generally have less locking overhead. Vector is a legacy class. Multiple dependent operations on a Vector still need additional coordination; synchronized individual methods do not make a whole sequence atomic.
