# Question 05

What is the significance of equals() and hashCode() methods in HashSet?

## Answer

hashCode helps HashSet locate candidate elements efficiently, and equals decides whether elements represent the same value. Equal objects must have equal hash codes; unequal objects may share a hash code. A custom class should override both methods consistently. Do not change fields used in equality or hashing while an object is stored in a HashSet, because lookup and removal can then fail.
