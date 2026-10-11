# Question 07

What is the difference between synchronizedCollection and ConcurrentHashMap?

## Answer

Collections.synchronizedCollection wraps a Collection and synchronizes its individual operations on one wrapper lock. Iteration requires an explicit synchronized block on that wrapper. ConcurrentHashMap is a specialized concurrent Map with atomic per-key update methods and weakly consistent iteration, and it is not a Collection. For wrapping a Map, the corresponding utility is Collections.synchronizedMap. These approaches protect different data structures and have different concurrency behavior.
