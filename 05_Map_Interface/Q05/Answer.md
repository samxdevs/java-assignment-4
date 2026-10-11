# Question 05

What is the difference between Hashtable and HashMap? Why is Hashtable considered legacy?

## Answer

Hashtable synchronizes its individual methods and allows neither null keys nor null values. HashMap is not synchronized and permits one null key and null values. Hashtable is a legacy class retained for compatibility. For modern concurrent access, ConcurrentHashMap is often useful; it also rejects null keys and values. Synchronization of individual operations does not automatically make a multi-step action atomic.
