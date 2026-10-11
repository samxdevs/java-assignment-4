# Question 05

What are the differences between CopyOnWriteArrayList and ArrayList?

## Answer

CopyOnWriteArrayList copies its backing array for each mutation. Its iterators read a snapshot from creation time and do not see later changes or throw ConcurrentModificationException because of those changes. It is thread-safe and useful when reads greatly outnumber writes. ArrayList is not thread-safe and its iterators are generally fail-fast. Frequent writes are expensive in CopyOnWriteArrayList, and its snapshot iterator does not support remove.
