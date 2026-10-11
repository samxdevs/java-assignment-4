# Question 05

What is the role of WeakHashMap in Java, and how is it different from HashMap?

## Answer

WeakHashMap holds its keys through weak references. If a key is no longer strongly referenced elsewhere, the garbage collector may reclaim it and its entry can disappear. HashMap keeps strong references to keys until they are removed. WeakHashMap values are strongly referenced, so a value must not retain its own key if you expect that key to be collected. Removal timing is unpredictable; WeakHashMap is not thread-safe.
