# Question 01

How is Vector different from ArrayList in terms of thread safety?

## Answer

Vector synchronizes its individual methods, so concurrent add calls do not corrupt its internal storage. ArrayList does not provide that synchronization. A sequence such as checking size and then removing needs additional synchronization on Vector, and traversal also needs coordination with writers. Thread-safe individual calls do not make every combined operation safe.
