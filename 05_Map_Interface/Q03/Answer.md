# Question 03

How does HashMap handle collisions?

## Answer

A collision happens when different keys map to the same hash bucket. HashMap checks candidate keys using equals, so different keys can share a bucket without overwriting one another. In modern Java implementations, crowded buckets can become balanced trees when implementation thresholds are met. Resizing redistributes entries as the map grows. If an equal key is put again, its value is replaced.
