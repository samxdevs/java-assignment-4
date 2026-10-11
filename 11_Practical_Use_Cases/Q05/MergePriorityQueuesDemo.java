import java.util.*;

public class MergePriorityQueuesDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PriorityQueue<Integer> first = readQueue(input, "first");
        PriorityQueue<Integer> second = readQueue(input, "second");
        PriorityQueue<Integer> merged = new PriorityQueue<>();
        merged.addAll(first);
        merged.addAll(second);
        System.out.println("Merged values in ascending order:");
        while (!merged.isEmpty()) {
            System.out.println(merged.poll());
        }
        System.out.println("Original queue sizes: " + first.size() + ", " + second.size());
    }

    private static PriorityQueue<Integer> readQueue(Scanner input, String label) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int count = readCount(input, "How many integers in the " + label + " queue? ");
        for (int i = 0; i < count; i++) {
            queue.offer(readInt(input, "Integer: "));
        }
        return queue;
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
