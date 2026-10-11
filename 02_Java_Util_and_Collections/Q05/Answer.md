# Question 05

What is the purpose of the Comparator and Comparable interfaces in the java.util package?

## Answer

Comparable<T> defines a class's natural order using compareTo, for example Integer numeric order or String alphabetical order. Comparator<T> defines an external/custom order using compare, so one class can be sorted in several ways. For students, one comparator can sort by marks and another by name. Comparator is in java.util; Comparable is actually in java.lang and is imported automatically. A negative, zero, or positive comparison result means less than, equal in order, or greater than.
