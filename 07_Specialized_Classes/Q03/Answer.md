# Question 03

What is the difference between BlockingQueue and PriorityQueue?

## Answer

BlockingQueue is an interface in java.util.concurrent with thread-safe producer-consumer operations such as put and take that can wait for space or data. PriorityQueue is a java.util class ordered by priority; it is not thread-safe and does not offer blocking operations. BlockingQueue does not necessarily use priority order. PriorityBlockingQueue combines priority ordering with blocking retrieval and thread safety.
