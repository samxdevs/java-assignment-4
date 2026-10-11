import java.util.Scanner;

public class GenericStackDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> numbers = new Stack<>();
        Stack<String> words = new Stack<>();
        int count = readCount(input, "How many integers to push? ");
        for (int i = 0; i < count; i++) {
            numbers.push(readInt(input, "Integer: "));
        }
        int wordCount = readCount(input, "How many strings to push? ");
        for (int i = 0; i < wordCount; i++) {
            System.out.print("String: ");
            words.push(input.nextLine());
        }
        showStack("Integer stack", numbers);
        showStack("String stack", words);
    }

    private static <T> void showStack(String label, Stack<T> stack) {
        System.out.println(label + " size: " + stack.size());
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Top using peek: " + stack.peek());
        System.out.println("Popping in LIFO order:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
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
