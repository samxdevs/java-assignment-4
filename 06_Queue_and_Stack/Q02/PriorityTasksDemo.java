import java.util.*;

public class PriorityTasksDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Comparator<Task> byPriority = new Comparator<Task>() {
            @Override
            public int compare(Task first, Task second) {
                int result = Integer.compare(first.getPriority(), second.getPriority());
                if (result == 0) {
                    return Integer.compare(first.getSequence(), second.getSequence());
                }
                return result;
            }
        };
        PriorityQueue<Task> tasks = new PriorityQueue<>(byPriority);
        int count = readCount(input, "How many tasks? ");
        System.out.println("A smaller priority number means higher priority.");
        for (int i = 0; i < count; i++) {
            System.out.print("Task description: ");
            String description = input.nextLine();
            int priority = readInt(input, "Priority number: ");
            tasks.offer(new Task(description, priority, i));
        }
        if (tasks.isEmpty()) {
            System.out.println("No tasks to remove.");
        } else {
            System.out.println("Removed highest-priority task: " + tasks.poll());
        }
        System.out.println("Remaining tasks in priority order:");
        // Poll a copy because PriorityQueue iteration does not give sorted order.
        PriorityQueue<Task> copy = new PriorityQueue<>(tasks);
        while (!copy.isEmpty()) {
            System.out.println(copy.poll());
        }
        System.out.println("Original remaining queue size: " + tasks.size());
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
