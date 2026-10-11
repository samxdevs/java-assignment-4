# Question 01

Implement a simple program using Queue (with LinkedList) to simulate a ticket booking system.

## Answer

A Queue<String> backed by LinkedList stores customer names in first-in, first-out order. The menu lets users join the ticket-booking queue, serve the next customer with poll, and display waiting customers. poll returns null when the queue is empty. Serving represents processing a booking request; this simple example does not model seat inventory.

## Files and running the program

- [TicketBookingDemo.java](TicketBookingDemo.java)

Open a terminal in this question folder, then run:

```sh
javac *.java
java TicketBookingDemo
```

Enter one answer per prompt. Numeric input is checked before use. Indexes start at 0 unless the prompt says otherwise. Count prompts accept 0 to 10000 items.

[sample_input.txt](sample_input.txt) contains one answer per line. [sample_output.txt](sample_output.txt) shows a captured run. To replay the sample:

```sh
java TicketBookingDemo < sample_input.txt
```
