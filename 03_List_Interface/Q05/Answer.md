# Question 05

How is the Stack class implemented, and how does it relate to the List interface?

## Answer

java.util.Stack<E> extends Vector<E>, so it indirectly implements List<E> and inherits indexed list operations. push, pop, and peek use the end of the underlying resizable array as the stack top, giving LIFO behavior. Stack is a legacy API; Deque with ArrayDeque is usually preferred for new stack code. This assignment separately demonstrates the requested Stack class.
