# Module 4 — All Answers

Every question follows the supplied assignment. Follow the links to source files, run instructions, and samples.

## Generics

### Q01

What is the purpose of generics in Java, and how do they improve type safety and code reusability?

Generics let a class, interface, or method work with a type chosen by its caller. For example, `ArrayList<String>` stores strings. The compiler rejects adding an integer, so many type mistakes are caught before the program runs. One generic class can work with String, Integer, and other reference types, which avoids repeating the same code. Generics also reduce the need for casts. Use wrapper types such as Integer instead of primitive types such as int.

[Open this question](01_Generics/Q01/Answer.md)

### Q02

Explain the syntax for creating a user-defined generic class in Java. Provide an example.

Declare a type parameter in angle brackets after the class name: `class Container<T>`. Use T as the type of fields, parameters, and return values. Create an object with an actual type, for example `Container<String> name = new Container<>();`. In the program, the same Container class stores a user-entered string and integer.

[Open this question](01_Generics/Q02/Answer.md)

### Q03

How do bounded type parameters work in generics? Write a generic class that accepts only subclasses of Number.

A bound limits the types allowed for a type parameter. `class NumberBox<T extends Number>` accepts Number and its subclasses, such as Integer and Double. It rejects String. The bound also allows the class to call Number methods such as `doubleValue()`. Here, extends is used for both class bounds and interface bounds.

[Open this question](01_Generics/Q03/Answer.md)

### Q04

What is the difference between ? extends T and ? super T in generics? Provide an example of when to use each.

`? extends T` means T or an unknown subtype of T. Use it when reading values as T, such as summing a List of Integer or Double through `List<? extends Number>`. You cannot safely add a non-null value because the exact element type is unknown. `? super T` means T or an unknown supertype of T. Use it when adding T values, such as adding integers to `List<? super Integer>`. Reading from that list gives Object. The program demonstrates both cases.

[Open this question](01_Generics/Q04/Answer.md)

### Q05

How do raw types differ from parameterized types in generics, and why should raw types be avoided?

A parameterized type specifies the element type: `List<String> names = new ArrayList<>();`. A raw type leaves it out: `List names = new ArrayList();`. Raw types disable useful generic checks and can cause unchecked warnings or a ClassCastException later. Avoid them in new code. For example, a raw list can hold both a string and an integer, while List<String> rejects the integer at compile time.

[Open this question](01_Generics/Q05/Answer.md)

### Q06

Write a generic class Pair<K, V> that holds two values of any types, K and V. Include methods to get and set the values.

Pair<K, V> uses two independent type parameters. Its constructor stores both values, and getters and setters read or update them. The demo uses Pair<String, Integer> for a name and age, then asks for replacement values.

[Open this question](01_Generics/Q06/Answer.md)

### Q07

Create a user-defined generic class Box<T> with methods addItem(T item) and getItem(). Demonstrate its usage with String and Integer types.

Box<T> stores one item. `addItem(T item)` saves or replaces that item, and `getItem()` returns it. The demo creates Box<String> and Box<Integer> and fills both from keyboard input. Before an item is added, this simple box contains null.

[Open this question](01_Generics/Q07/Answer.md)

### Q08

Write a generic method swapElements that swaps two elements in an array. Demonstrate its usage with different data types.

The method declares `<T>` before its return type: `public static <T> void swapElements(T[] array, int first, int second)`. A temporary variable holds one element during the swap. The demo accepts Integer and String arrays and uses zero-based indexes. Bounds checks prevent invalid positions from being used. Generic arrays here use Integer[], because primitive int[] does not match T[].

[Open this question](01_Generics/Q08/Answer.md)

### Q09

Develop a user-defined generic class Stack<T> that provides standard stack operations like push(T item), pop(), and peek(). Demonstrate with integers and strings.

The custom Stack<T> stores items in an ArrayList<T>. push adds at the end, pop removes the last item, and peek reads the last item without removing it. This gives last-in, first-out (LIFO) behavior. pop and peek throw EmptyStackException when the stack is empty; the demo checks isEmpty before calling them. Both integers and strings are demonstrated.

[Open this question](01_Generics/Q09/Answer.md)

### Q10

Implement a generic class MinMaxFinder<T extends Comparable<T>> that provides methods findMin() and findMax() to find the minimum and maximum elements in a list. Demonstrate it with a list of integers and strings.

`T extends Comparable<T>` requires elements that can compare themselves using compareTo. findMin and findMax start with the first element, scan the list, and update the result when a smaller or larger element is found. The class rejects an empty list because an empty list has no minimum or maximum. Integer uses numeric order; String uses natural, case-sensitive lexicographic order.

[Open this question](01_Generics/Q10/Answer.md)

## Java.util package and collection framework

### Q01

What is the java.util package, and why is it essential in Java programming?

java.util contains general-purpose utilities such as Scanner, Random, ArrayList, HashSet, HashMap, Iterator, and Collections. It provides ready-made tools for input, storing data, traversing data, and common algorithms, so we do not have to build these tools from scratch. Use imports such as `import java.util.ArrayList;`. Concurrency utilities are in the separate java.util.concurrent package.

[Open this question](02_Java_Util_and_Collections/Q01/Answer.md)

### Q02

What are the key features of the Collection Framework in java.util?

The Collection Framework provides standard interfaces, reusable implementations, generics for type safety, iterators, and algorithms such as sorting and searching. Different implementations let us choose useful properties such as order, uniqueness, fast lookup, or thread safety. Collection is the main root interface for groups of elements; Map belongs to the framework but has its own hierarchy.

[Open this question](02_Java_Util_and_Collections/Q02/Answer.md)

### Q03

Explain the differences between Collection and Collections in java.util.

Collection<E> is an interface representing a group of elements, with methods such as add, remove, size, and iterator. Collections is a utility class with static methods such as sort, reverse, shuffle, binarySearch, and frequency. Example: `Collection<String> names = new ArrayList<>();` represents data, while `Collections.sort(list);` performs an operation on a List.

[Open this question](02_Java_Util_and_Collections/Q03/Answer.md)

### Q04

What is the role of the Iterator interface in the java.util package?

Iterator<E> visits elements without requiring indexes. hasNext checks whether another element is available, and next returns it. Where supported, iterator.remove safely removes the last returned element during traversal. Example: `Iterator<Integer> it = numbers.iterator(); while (it.hasNext()) { System.out.println(it.next()); }`. Most ordinary collection iterators are fail-fast on unexpected structural changes; this is a best-effort bug check, not thread safety.

[Open this question](02_Java_Util_and_Collections/Q04/Answer.md)

### Q05

What is the purpose of the Comparator and Comparable interfaces in the java.util package?

Comparable<T> defines a class's natural order using compareTo, for example Integer numeric order or String alphabetical order. Comparator<T> defines an external/custom order using compare, so one class can be sorted in several ways. For students, one comparator can sort by marks and another by name. Comparator is in java.util; Comparable is actually in java.lang and is imported automatically. A negative, zero, or positive comparison result means less than, equal in order, or greater than.

[Open this question](02_Java_Util_and_Collections/Q05/Answer.md)

### Q06

What are the key interfaces in the Java Collection Framework, and how are they related?

Iterable<E> provides iterator(). Collection<E> extends Iterable<E>; List<E>, Set<E>, and Queue<E> extend Collection<E>. Deque<E> extends Queue<E>. SortedSet extends Set, and NavigableSet extends SortedSet. Map<K,V> is separate: SortedMap extends Map and NavigableMap extends SortedMap. Examples include ArrayList for List, HashSet for Set, LinkedList for Queue, and ArrayDeque for Deque.

[Open this question](02_Java_Util_and_Collections/Q06/Answer.md)

### Q07

What is the difference between Collection and Map interfaces in Java?

Collection<E> stores individual elements, such as names. Map<K,V> stores associations between unique keys and values, such as employee ID to employee name. Map is not a subtype of Collection. A Map can expose collection views through keySet(), values(), and entrySet(). Values can repeat, but putting an existing key replaces its value.

[Open this question](02_Java_Util_and_Collections/Q07/Answer.md)

### Q08

Explain the differences between Set, List, and Queue in the Collection Framework.

List preserves element order, supports indexes, and allows duplicates. Set stores unique elements; its ordering depends on its implementation. Queue holds elements for processing, usually in first-in, first-out order, although PriorityQueue uses priority order. Choose List for an ordered sequence, Set for uniqueness, and Queue for pending work.

[Open this question](02_Java_Util_and_Collections/Q08/Answer.md)

### Q09

What is the significance of the Iterable interface, and how is it used in the Collection Framework?

Iterable<E> defines iterator(), which supplies a way to visit elements. Since Collection extends Iterable, lists, sets, and queues can be used in an enhanced for loop: `for (String name : names) { System.out.println(name); }`. Map itself is not Iterable, but its keySet, values, and entrySet views are.

[Open this question](02_Java_Util_and_Collections/Q09/Answer.md)

### Q10

What are the benefits of using the Collection Framework over arrays?

Many collection implementations grow dynamically and provide convenient add, remove, search, sort, and iteration operations. They offer useful data structures such as sets, maps, queues, and thread-safe variants. Arrays have a fixed length, support primitives directly, and can be simpler or more memory-efficient for fixed-size data. Collections generally store reference types, so an integer collection uses Integer.

[Open this question](02_Java_Util_and_Collections/Q10/Answer.md)

### Q11

Write a program to iterate over a List of integers using:
- A simple for loop
- An enhanced for loop
- A while loop with an Iterator

The program reads an integer List and prints the same elements using an indexed for loop, an enhanced for loop, and a while loop with Iterator. The Iterator version uses hasNext and next instead of indexes.

[Open this question](02_Java_Util_and_Collections/Q11/Answer.md)

### Q12

Write a generic method to print all elements of any Collection (e.g., List, Set, Queue).

`public static <T> void printElements(Collection<T> items)` accepts collections of different element types. An enhanced for loop prints each element. The program demonstrates a List, a LinkedHashSet, and a LinkedList used as a Queue. The set removes duplicates; the list and queue preserve them.

[Open this question](02_Java_Util_and_Collections/Q12/Answer.md)

## List Interface

### Q01

What is the List interface, and how does it differ from the Set interface?

List<E> represents an ordered sequence. It allows duplicates and supports zero-based indexed operations such as get, set, and remove. Set<E> represents unique elements and does not offer indexed access. Lists preserve sequence order; a set's iteration order depends on its implementation.

[Open this question](03_List_Interface/Q01/Answer.md)

### Q02

What is the difference between ArrayList and LinkedList in terms of performance and usage?

ArrayList uses a resizable array. get(index) is O(1), appending is amortized O(1), and inserting or removing in the middle usually takes O(n) because elements shift. LinkedList uses doubly linked nodes. Adding or removing at an end is O(1), but finding an index takes O(n). Removing an already located node through an iterator is O(1). Choose ArrayList for most everyday lists and random access; LinkedList can suit repeated end operations. LinkedList also has extra node memory overhead.

[Open this question](03_List_Interface/Q02/Answer.md)

### Q03

Write a program to demonstrate the use of ArrayList for storing and iterating over elements.

The program reads strings into an ArrayList and prints them using an enhanced for loop. ArrayList keeps insertion order and permits repeated values.

[Open this question](03_List_Interface/Q03/Answer.md)

### Q04

What is the role of the Vector class, and how does it differ from ArrayList?

Vector is a resizable-array List whose individual methods are synchronized. ArrayList is also a resizable-array List, but its methods are not synchronized and generally have less locking overhead. Vector is a legacy class. Multiple dependent operations on a Vector still need additional coordination; synchronized individual methods do not make a whole sequence atomic.

[Open this question](03_List_Interface/Q04/Answer.md)

### Q05

How is the Stack class implemented, and how does it relate to the List interface?

java.util.Stack<E> extends Vector<E>, so it indirectly implements List<E> and inherits indexed list operations. push, pop, and peek use the end of the underlying resizable array as the stack top, giving LIFO behavior. Stack is a legacy API; Deque with ArrayDeque is usually preferred for new stack code. This assignment separately demonstrates the requested Stack class.

[Open this question](03_List_Interface/Q05/Answer.md)

### Q06

Create a List of strings and perform the following operations:
- Add elements to the list.
- Remove an element by value and index.
- Replace an element at a specific index.
- Print the list after each operation.

The program reads a string list and prints it after each add. It then removes by value, removes by a zero-based index, and replaces an element using set. Each stage prints the result, and index checks handle an empty list or invalid position.

[Open this question](03_List_Interface/Q06/Answer.md)

### Q07

Write a program to compare the performance of ArrayList and LinkedList for:
- Adding elements at the beginning.
- Removing elements from the middle.
- Iterating through the list.

The program times inserting at index 0, repeatedly removing at the current middle index, and iterating through equal-sized lists. Setup is outside the measured removal and iteration blocks. Both lists use the same values and operations. LinkedList can add at the beginning quickly, but remove(index) still needs traversal. Timing varies with warm-up, garbage collection, and the computer, so this is a classroom demonstration rather than a reliable benchmark. Traversal uses enhanced for loops to avoid repeated indexed access on LinkedList.

[Open this question](03_List_Interface/Q07/Answer.md)

### Q08

Write a program to sort an ArrayList of strings alphabetically and reverse alphabetically.

Collections.sort puts the strings in natural order. Collections.sort with Collections.reverseOrder puts them in reverse natural order. Java's natural String ordering is case-sensitive, so using the same letter case makes the alphabetical result easier to see.

[Open this question](03_List_Interface/Q08/Answer.md)

## Set Interface

### Q01

What is the Set interface, and how is it different from List?

Set<E> stores unique elements. Adding an equal element again does not create another entry. List<E> allows duplicates, preserves sequence order, and has indexed access. Set has no indexes, and its iteration order depends on the implementation.

[Open this question](04_Set_Interface/Q01/Answer.md)

### Q02

What is the difference between HashSet, LinkedHashSet, and TreeSet in Java?

HashSet uses hashing and has no guaranteed iteration order; basic operations are expected O(1) with suitable hashes. LinkedHashSet also uses hashing and keeps insertion order, with extra links and memory. TreeSet stores elements in sorted order using a balanced tree, and basic operations are O(log n). TreeSet uses natural order or a Comparator and treats a comparison result of zero as a duplicate.

[Open this question](04_Set_Interface/Q02/Answer.md)

### Q03

Write a program to demonstrate the use of TreeSet for storing sorted elements.

The program reads integers into a TreeSet. Printing or iterating the set shows ascending natural order, even if the input was unsorted. Duplicate integers are stored only once.

[Open this question](04_Set_Interface/Q03/Answer.md)

### Q04

How does HashSet handle duplicate elements? Explain with an example.

HashSet uses hashCode to find a bucket and equals to check equality among candidate elements. add returns false for an element equal to one already present, leaving the set unchanged. Example: adding "apple", "banana", and "apple" gives a set with size 2. The display order is not guaranteed.

[Open this question](04_Set_Interface/Q04/Answer.md)

### Q05

What is the significance of equals() and hashCode() methods in HashSet?

hashCode helps HashSet locate candidate elements efficiently, and equals decides whether elements represent the same value. Equal objects must have equal hash codes; unequal objects may share a hash code. A custom class should override both methods consistently. Do not change fields used in equality or hashing while an object is stored in a HashSet, because lookup and removal can then fail.

[Open this question](04_Set_Interface/Q05/Answer.md)

### Q06

Write a program to demonstrate the uniqueness property of HashSet by attempting to add duplicate elements.

The program prints the boolean returned by HashSet.add for each user-entered string. The first occurrence returns true; a later equal string returns false. The final size counts only unique strings. String matching is case-sensitive, so "Apple" and "apple" differ.

[Open this question](04_Set_Interface/Q06/Answer.md)

### Q07

Create a TreeSet of integers and perform the following operations:
- Add elements to the set.
- Find the smallest and largest elements.
- Remove a specific element.

The program builds a TreeSet from input, prints the sorted set, and uses first and last to find the smallest and largest values. It checks isEmpty first, because first and last cannot be called on an empty set. It then removes a requested value and prints the remaining set.

[Open this question](04_Set_Interface/Q07/Answer.md)

### Q08

Write a program to iterate over a LinkedHashSet and explain its order-preserving property.

LinkedHashSet preserves the order in which distinct elements were first added. Adding a duplicate does not move it to the end. The program iterates with an enhanced for loop; for input red, blue, red, green, it prints red, blue, green.

[Open this question](04_Set_Interface/Q08/Answer.md)

## Map Interface

### Q01

What is the Map interface in Java, and how is it different from Collection?

Map<K,V> stores key-value pairs. Each key is unique, but different keys can have the same value. Collection<E> stores individual elements. Map does not extend Collection; it provides views such as keySet, values, and entrySet. Example: Map<Integer,String> connects an employee ID with a name.

[Open this question](05_Map_Interface/Q01/Answer.md)

### Q02

What is the difference between HashMap, LinkedHashMap, and TreeMap?

HashMap uses hashing and has no guaranteed iteration order. LinkedHashMap normally keeps insertion order and can also be configured to keep access order. TreeMap sorts by key using natural order or a Comparator. HashMap and LinkedHashMap have expected O(1) basic operations with suitable hashes, while TreeMap has O(log n) basic operations. Reusing a key updates its value.

[Open this question](05_Map_Interface/Q02/Answer.md)

### Q03

How does HashMap handle collisions?

A collision happens when different keys map to the same hash bucket. HashMap checks candidate keys using equals, so different keys can share a bucket without overwriting one another. In modern Java implementations, crowded buckets can become balanced trees when implementation thresholds are met. Resizing redistributes entries as the map grows. If an equal key is put again, its value is replaced.

[Open this question](05_Map_Interface/Q03/Answer.md)

### Q04

Write a program to demonstrate the use of TreeMap for sorting keys.

The program reads integer keys and string values into a TreeMap, then iterates over entrySet. Entries print in ascending key order. Re-entering a key replaces its previous value.

[Open this question](05_Map_Interface/Q04/Answer.md)

### Q05

What is the difference between Hashtable and HashMap? Why is Hashtable considered legacy?

Hashtable synchronizes its individual methods and allows neither null keys nor null values. HashMap is not synchronized and permits one null key and null values. Hashtable is a legacy class retained for compatibility. For modern concurrent access, ConcurrentHashMap is often useful; it also rejects null keys and values. Synchronization of individual operations does not automatically make a multi-step action atomic.

[Open this question](05_Map_Interface/Q05/Answer.md)

### Q06

Write a program to create a HashMap of employee IDs and names. Perform the following operations:
- Add new key-value pairs.
- Check if a key exists.
- Iterate through the map using:
- KeySet
- EntrySet

The program reads employee IDs and names into a HashMap, checks a user-entered ID with containsKey, and prints entries first through keySet plus get, then through entrySet. Employee IDs are unique: adding an existing ID updates its name. HashMap iteration order is not guaranteed.

[Open this question](05_Map_Interface/Q06/Answer.md)

### Q07

Write a program to demonstrate the sorted order of keys in TreeMap by adding unsorted key-value pairs.

The program accepts key-value pairs in any order and displays the TreeMap in sorted key order. The example input intentionally uses keys 30, 10, and 20. TreeMap sorts the keys automatically; no extra sort call is required.

[Open this question](05_Map_Interface/Q07/Answer.md)

### Q08

Write a program to show the difference between HashMap and LinkedHashMap in terms of iteration order.

The same user-entered entries are added to a HashMap and a LinkedHashMap. LinkedHashMap iteration follows insertion order; HashMap order is unspecified. A particular HashMap may happen to print the same order, which does not establish an ordering guarantee. Updating an existing LinkedHashMap key normally leaves it in its original insertion position.

[Open this question](05_Map_Interface/Q08/Answer.md)

## Queue and stack

### Q01

Implement a simple program using Queue (with LinkedList) to simulate a ticket booking system.

A Queue<String> backed by LinkedList stores customer names in first-in, first-out order. The menu lets users join the ticket-booking queue, serve the next customer with poll, and display waiting customers. poll returns null when the queue is empty. Serving represents processing a booking request; this simple example does not model seat inventory.

[Open this question](06_Queue_and_Stack/Q01/Answer.md)

### Q02

Use a PriorityQueue to store a list of tasks with priorities. Add tasks, remove the highest-priority task, and print the queue.

Each Task has a description and numeric priority. The comparator treats a smaller number as higher priority and uses input order to break ties. poll removes the highest-priority task. PriorityQueue iteration is not sorted, so the program prints priority order by polling a copy, leaving the original queue intact.

[Open this question](06_Queue_and_Stack/Q02/Answer.md)

### Q03

Write a program to implement a Stack using the Stack class. Perform operations like push, pop, peek, and check if it is empty.

The program uses java.util.Stack<Integer> and a menu for push, pop, peek, display, and isEmpty. The last pushed value is removed first. Empty checks prevent EmptyStackException in the interactive demo.

[Open this question](06_Queue_and_Stack/Q03/Answer.md)

### Q04

Implement a deque using the ArrayDeque class. Perform operations like:
- Add elements at both ends.
- Remove elements from both ends.
- Peek at both ends.

ArrayDeque implements Deque. The program uses addFirst and addLast to add at both ends, peekFirst and peekLast to inspect them, and pollFirst and pollLast to remove from both ends. Peek and poll return null when empty. ArrayDeque does not permit null elements.

[Open this question](06_Queue_and_Stack/Q04/Answer.md)

### Q05

Write a program to check if a string is a palindrome using a Deque.

The program puts the input characters in an ArrayDeque<Character>, then compares and removes the front and back until at most one character remains. Any mismatch means the string is not a palindrome. This version compares the exact text, including case, spaces, and punctuation. Empty and one-character strings are palindromes.

[Open this question](06_Queue_and_Stack/Q05/Answer.md)

## Specialized Classes

### Q01

What is the purpose of the PriorityQueue class in Java?

PriorityQueue stores elements according to natural order or a Comparator, so peek and poll access the least element under that order. To model highest importance, define a comparator with the intended priority rule. offer and poll take O(log n), and peek takes O(1). Iteration is not sorted, ties have no general FIFO guarantee, and null elements are not allowed.

[Open this question](07_Specialized_Classes/Q01/Answer.md)

### Q02

How is the Deque interface different from the Queue interface?

Queue provides operations for elements waiting to be processed, typically adding at one end and removing at the other. Deque extends Queue and supports adding, removing, and inspecting at both ends. It can act as a FIFO queue or a LIFO stack. Examples include ArrayDeque and LinkedList.

[Open this question](07_Specialized_Classes/Q02/Answer.md)

### Q03

What is the difference between BlockingQueue and PriorityQueue?

BlockingQueue is an interface in java.util.concurrent with thread-safe producer-consumer operations such as put and take that can wait for space or data. PriorityQueue is a java.util class ordered by priority; it is not thread-safe and does not offer blocking operations. BlockingQueue does not necessarily use priority order. PriorityBlockingQueue combines priority ordering with blocking retrieval and thread safety.

[Open this question](07_Specialized_Classes/Q03/Answer.md)

### Q04

Write a program to implement a simple Queue using the LinkedList class.

The program declares Queue<Integer> queue = new LinkedList<>(), reads values using offer, checks the front with peek, and removes values in FIFO order using poll. It handles an empty queue before showing the front.

[Open this question](07_Specialized_Classes/Q04/Answer.md)

### Q05

What is the role of WeakHashMap in Java, and how is it different from HashMap?

WeakHashMap holds its keys through weak references. If a key is no longer strongly referenced elsewhere, the garbage collector may reclaim it and its entry can disappear. HashMap keeps strong references to keys until they are removed. WeakHashMap values are strongly referenced, so a value must not retain its own key if you expect that key to be collected. Removal timing is unpredictable; WeakHashMap is not thread-safe.

[Open this question](07_Specialized_Classes/Q05/Answer.md)

## Concurrency and Thread-Safety

### Q01

How is Vector different from ArrayList in terms of thread safety?

Vector synchronizes its individual methods, so concurrent add calls do not corrupt its internal storage. ArrayList does not provide that synchronization. A sequence such as checking size and then removing needs additional synchronization on Vector, and traversal also needs coordination with writers. Thread-safe individual calls do not make every combined operation safe.

[Open this question](08_Concurrency_and_Thread_Safety/Q01/Answer.md)

### Q02

Write a program to demonstrate the thread-safe nature of Vector by adding elements to it from multiple threads.

The program starts two threads that add disjoint ranges of integers to one Vector. It joins both threads before printing the expected and actual size. A matching count demonstrates that concurrent individual add calls are retained. Element order depends on thread scheduling, so the program checks the count rather than promising a fixed order.

[Open this question](08_Concurrency_and_Thread_Safety/Q02/Answer.md)

### Q03

What is the role of ConcurrentHashMap in Java, and how does it achieve thread safety?

ConcurrentHashMap supports safe access and updates from multiple threads. Reads generally avoid locking, while updates use internal atomic operations and coordination around affected portions of the map rather than locking the entire map for every call. Operations such as compute and merge can update a key atomically. Its iterators are weakly consistent, and it permits neither null keys nor null values. A get followed by a put is not automatically an atomic compound update.

[Open this question](08_Concurrency_and_Thread_Safety/Q03/Answer.md)

### Q04

Create a ConcurrentHashMap and demonstrate how it handles concurrent modifications.

Two threads increment the same counter in a ConcurrentHashMap using merge, which makes each per-key increment atomic. Another thread iterates while updates occur. Iteration is weakly consistent and may show an intermediate value without throwing ConcurrentModificationException. After all joins, the final counter must equal twice the increments per worker.

[Open this question](08_Concurrency_and_Thread_Safety/Q04/Answer.md)

### Q05

What are the differences between CopyOnWriteArrayList and ArrayList?

CopyOnWriteArrayList copies its backing array for each mutation. Its iterators read a snapshot from creation time and do not see later changes or throw ConcurrentModificationException because of those changes. It is thread-safe and useful when reads greatly outnumber writes. ArrayList is not thread-safe and its iterators are generally fail-fast. Frequent writes are expensive in CopyOnWriteArrayList, and its snapshot iterator does not support remove.

[Open this question](08_Concurrency_and_Thread_Safety/Q05/Answer.md)

### Q06

Write a program using CopyOnWriteArrayList to iterate and modify a list safely in a multithreaded environment.

The program creates an iterator before starting a reader thread and a writer thread. The writer adds one value and removes another while the reader visits the original snapshot. CountDownLatch starts both workers together without sleep-based timing. After joining, the program prints the updated list. The old iterator still visits the original elements safely, and thread-output order may vary.

[Open this question](08_Concurrency_and_Thread_Safety/Q06/Answer.md)

### Q07

What is the difference between synchronizedCollection and ConcurrentHashMap?

Collections.synchronizedCollection wraps a Collection and synchronizes its individual operations on one wrapper lock. Iteration requires an explicit synchronized block on that wrapper. ConcurrentHashMap is a specialized concurrent Map with atomic per-key update methods and weakly consistent iteration, and it is not a Collection. For wrapping a Map, the corresponding utility is Collections.synchronizedMap. These approaches protect different data structures and have different concurrency behavior.

[Open this question](08_Concurrency_and_Thread_Safety/Q07/Answer.md)

## Utility Methods in Collections Class

### Q01

What are some commonly used methods in the Collections utility class?

Common Collections static methods include sort (order a List), reverse (reverse a List), shuffle (randomize a List), binarySearch (search a sorted List), min/max (find extreme elements), frequency (count equal elements), swap (exchange two positions), and unmodifiableList/synchronizedList (create wrappers). Example: Collections.sort(numbers);. Binary search requires the same ordering used to sort the list.

[Open this question](09_Collections_Utility_Methods/Q01/Answer.md)

### Q02

Write a program to shuffle and sort an ArrayList using methods from the Collections class.

The program reads an ArrayList of integers, prints it, shuffles it with Collections.shuffle, and then sorts it with Collections.sort. A shuffle can occasionally leave the order unchanged; it is still a valid random shuffle.

[Open this question](09_Collections_Utility_Methods/Q02/Answer.md)

### Q03

How can you make a collection thread-safe using the Collections class?

Use wrappers such as Collections.synchronizedList(new ArrayList<>()), synchronizedSet, or synchronizedMap. All access to the underlying structure should go through the wrapper. For iteration, synchronize on the returned wrapper: `synchronized (list) { for (String item : list) { System.out.println(item); } }`. Compound operations also need explicit synchronization when they must happen together.

[Open this question](09_Collections_Utility_Methods/Q03/Answer.md)

### Q04

Create an unmodifiable List using Collections.unmodifiableList() and show what happens when you try to modify it.

Collections.unmodifiableList returns a read-only view of an existing list. Adding, removing, or replacing through that view throws UnsupportedOperationException. The program catches that exception and also changes the backing list to show that the view reflects backing-list updates. The wrapper does not make contained objects immutable.

[Open this question](09_Collections_Utility_Methods/Q04/Answer.md)

### Q05

Write a program to perform a binary search on a List using the Collections.binarySearch() method.

The program sorts the entered list before calling Collections.binarySearch. A nonnegative result is a zero-based index where the value was found; for duplicates, any matching index may be returned. A negative result encodes the insertion point as `-(result + 1)`. This is where the missing value could be inserted while preserving sorted order.

[Open this question](09_Collections_Utility_Methods/Q05/Answer.md)

### Q06

Write a program to find the frequency of elements in a list using Collections.frequency().

Collections.frequency counts elements equal to a specified value. The program reads a list of strings and a target string, then prints the count. Matching is case-sensitive, and a missing target has frequency zero.

[Open this question](09_Collections_Utility_Methods/Q06/Answer.md)

## Custom Comparator

### Q01

Write a program to sort a list of custom objects (e.g., Student with name and marks) using a Comparator.

Student stores a name and marks. A Comparator sorts students by marks in descending order, then by name for a tie. The program uses an anonymous Comparator class so the comparison steps are visible. Integer.compare avoids subtraction-based overflow.

[Open this question](10_Custom_Comparator/Q01/Answer.md)

### Q02

Write a program to sort a Map by its values using a custom Comparator.

A Map does not generally sort its entries by value. The program copies entrySet into an ArrayList and sorts entries by ascending value with a Comparator, breaking ties by key. It inserts the sorted entries into a LinkedHashMap to preserve that display order. Equal values are all retained; sorting by value does not remove entries.

[Open this question](10_Custom_Comparator/Q02/Answer.md)

## Practical Use Cases

### Q01

Create a class LruCache<K, V> using LinkedHashMap to implement an LRU (Least Recently Used) cache.

LruCache<K,V> extends LinkedHashMap and enables access order by passing true to the constructor. Reading or updating an entry makes it most recently used. removeEldestEntry returns true when size exceeds capacity, which evicts the least recently used entry after insertion. The demo lets users put, get, and display entries; display order runs from least to most recently used. This simple cache is not thread-safe.

[Open this question](11_Practical_Use_Cases/Q01/Answer.md)

### Q02

Implement a basic to-do list application using ArrayList to store tasks. Add functionality to add, remove, and display tasks.

The menu stores tasks in ArrayList<String>. Users can add a task, display numbered tasks, or remove a task by its displayed number. The program converts the one-based task number to a zero-based list index and validates it. Tasks are kept in memory for the current run.

[Open this question](11_Practical_Use_Cases/Q02/Answer.md)

### Q03

Write a program to count the frequency of characters in a string using a HashMap.

The program scans the input one char at a time and uses a HashMap<Character,Integer> to count occurrences. Spaces, punctuation, and letter case are included. It sorts a copy of the keys only for readable output. char represents a UTF-16 code unit, so some emoji or other supplementary Unicode characters occupy two char entries.

[Open this question](11_Practical_Use_Cases/Q03/Answer.md)

### Q04

Create a program to store students’ grades in a TreeMap, with student names as keys and grades as values. Allow adding, removing, and querying grades.

TreeMap<String,String> stores student names and grades. The menu allows adding or updating a grade, removing a student, querying a grade, and displaying all students. Keys use natural, case-sensitive name order. An existing name has its grade replaced. Data is stored in memory for the current run.

[Open this question](11_Practical_Use_Cases/Q04/Answer.md)

### Q05

Write a program to merge two PriorityQueue objects and sort the resulting queue.

The program reads two PriorityQueue<Integer> objects, adds both into a new queue, and repeatedly polls the merged queue to print ascending order. Duplicate numbers remain. A PriorityQueue's normal iterator is not sorted, so polling is necessary for ordered output.

[Open this question](11_Practical_Use_Cases/Q05/Answer.md)

## Advanced Questions

### Q01

Create a generic MultiMap<K, V> class that stores multiple values for a single key using a HashMap<K, List<V>>.

MultiMap<K,V> keeps a HashMap<K,List<V>>. put creates an ArrayList the first time a key appears, then appends the value. get returns a copy of the values, so callers cannot accidentally change the internal list. Missing keys return an empty list. Duplicate values are allowed, and HashMap key order is not guaranteed.

[Open this question](12_Advanced_Questions/Q01/Answer.md)

### Q02

Write a program to implement a simple banking system using Map to store customer IDs and their account balances.

The menu maps customer IDs to BigDecimal balances. It supports account creation, deposit, withdrawal, checking a balance, and displaying accounts. IDs must be unique; missing accounts and nonpositive amounts are rejected. Withdrawals cannot exceed the balance. BigDecimal is created directly from decimal text and amounts must have at most two decimal places, avoiding binary floating-point rounding for money. This is an in-memory classroom example.

[Open this question](12_Advanced_Questions/Q02/Answer.md)

### Q03

Use a WeakHashMap to demonstrate how entries are garbage-collected when keys are no longer strongly referenced.

The program retains one key and releases another by setting its strong reference to null. A WeakReference tracks the released key. It requests garbage collection a limited number of times and accesses the WeakHashMap to allow stale entries to be removed. System.gc is only a request: collection is not guaranteed, so the program reports either observation honestly. A strongly retained key should remain. The keys are custom objects, which avoids String interning affecting the demonstration.

[Open this question](12_Advanced_Questions/Q03/Answer.md)

### Q04

Create a program to implement a book catalog system using HashMap, where book titles are the keys and author names are the values. Allow searching by title.

HashMap<String,String> maps book titles to author names. The menu allows adding or updating books, searching by an exact title, and displaying the catalog. Titles are case-sensitive. Adding an existing title replaces its author. HashMap display order is not guaranteed, and the catalog exists only during the current run.

[Open this question](12_Advanced_Questions/Q04/Answer.md)

### Q05

Write a program to store a list of products and their prices in a TreeMap and display the products in sorted order by name.

TreeMap<String,BigDecimal> stores product names and prices. After reading products, entrySet iteration prints products in natural, case-sensitive name order. An existing product name updates its price. Prices must be nonnegative decimal values with at most two decimal places.

[Open this question](12_Advanced_Questions/Q05/Answer.md)
