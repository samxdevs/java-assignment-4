# Question 03

What is the role of ConcurrentHashMap in Java, and how does it achieve thread safety?

## Answer

ConcurrentHashMap supports safe access and updates from multiple threads. Reads generally avoid locking, while updates use internal atomic operations and coordination around affected portions of the map rather than locking the entire map for every call. Operations such as compute and merge can update a key atomically. Its iterators are weakly consistent, and it permits neither null keys nor null values. A get followed by a put is not automatically an atomic compound update.
