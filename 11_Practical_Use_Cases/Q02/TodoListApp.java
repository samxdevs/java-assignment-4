import java.util.*;

public class TodoListApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        while (true) {
            System.out.println("1. Add task  2. Remove task  3. Display tasks  0. Exit");
            int choice = readInt(input, "Choice: ");
            switch (choice) {
                case 1:
                    System.out.print("Task: ");
                    String task = input.nextLine();
                    if (task.trim().isEmpty()) {
                        System.out.println("Task cannot be blank.");
                    } else {
                        tasks.add(task);
                        System.out.println("Task added.");
                    }
                    break;
                case 2:
                    int number = readInt(input, "Task number to remove (starts at 1): ");
                    if (number >= 1 && number <= tasks.size()) {
                        System.out.println("Removed: " + tasks.remove(number - 1));
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks yet.");
                    }
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
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
}
