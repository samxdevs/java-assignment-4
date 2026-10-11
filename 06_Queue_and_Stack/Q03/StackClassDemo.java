import java.util.Scanner;
import java.util.Stack;

public class StackClassDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        while (true) {
            System.out.println("\n        1. Push  2. Pop  3. Peek  4. Check empty  5. Display  0. Exit");
            int choice = readInt(input, "Choice: ");
            switch (choice) {
                case 1:
                    stack.push(readInt(input, "Integer to push: "));
                    System.out.println("Stack: " + stack);
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Popped: " + stack.pop());
                    }
                    break;
                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Top: " + stack.peek());
                    }
                    break;
                case 4:
                    System.out.println("Empty? " + stack.isEmpty());
                    break;
                case 5:
                    System.out.println("Stack (top is at the right): " + stack);
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
