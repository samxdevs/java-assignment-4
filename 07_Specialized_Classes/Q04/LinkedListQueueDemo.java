import java.util.*;

public class LinkedListQueueDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int count = readCount(input, "How many integers? ");
        for (int i = 0; i < count; i++) {
            queue.offer(readInt(input, "Integer " + (i + 1) + ": "));
        }

        System.out.println("Queue: " + queue);
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front: " + queue.peek());
        }
        System.out.println("Removing in FIFO order:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println("Empty after removal? " + queue.isEmpty());
    }


    // Read a whole number without mixing nextInt() and nextLine().
    private static int readInt(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(input.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a whole number.");
            }
        }
    }

    private static int readCount(Scanner input, String prompt) {
        while (true) {
            int count = readInt(input, prompt);
            if (count >= 0 && count <= 10000) {
                return count;
            }
            System.out.println("Enter a count from 0 to 10000.");
        }
    }
}
