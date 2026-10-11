# Question 01

Create a class LruCache<K, V> using LinkedHashMap to implement an LRU (Least Recently Used) cache.

## Answer

LruCache<K,V> extends LinkedHashMap and enables access order by passing true to the constructor. Reading or updating an entry makes it most recently used. removeEldestEntry returns true when size exceeds capacity, which evicts the least recently used entry after insertion. The demo lets users put, get, and display entries; display order runs from least to most recently used. This simple cache is not thread-safe.

## Files and running the program

- [LruCache.java](LruCache.java)
- [LruCacheDemo.java](LruCacheDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java LruCacheDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java LruCacheDemo < sample_input.txt
```
