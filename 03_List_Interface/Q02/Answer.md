# Question 02

What is the difference between ArrayList and LinkedList in terms of performance and usage?

## Answer

ArrayList uses a resizable array. get(index) is O(1), appending is amortized O(1), and inserting or removing in the middle usually takes O(n) because elements shift. LinkedList uses doubly linked nodes. Adding or removing at an end is O(1), but finding an index takes O(n). Removing an already located node through an iterator is O(1). Choose ArrayList for most everyday lists and random access; LinkedList can suit repeated end operations. LinkedList also has extra node memory overhead.
