import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Deque<String> deque = new ArrayDeque<>();
        System.out.print("First element to add at the front: ");
        deque.addFirst(input.nextLine());
        System.out.print("Second element to add at the back: ");
        deque.addLast(input.nextLine());
        System.out.print("Third element to add at the front: ");
        deque.addFirst(input.nextLine());
        System.out.print("Fourth element to add at the back: ");
        deque.addLast(input.nextLine());
        System.out.println("Deque: " + deque);
        System.out.println("Front using peekFirst: " + deque.peekFirst());
        System.out.println("Back using peekLast: " + deque.peekLast());
        System.out.println("Removed front: " + deque.pollFirst());
        System.out.println("Removed back: " + deque.pollLast());
        System.out.println("Remaining deque: " + deque);
    }
}
