import java.util.*;

public class ListOperationsDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        int count = readCount(input, "How many strings to add? ");
        for (int i = 0; i < count; i++) {
            System.out.print("String: ");
            words.add(input.nextLine());
            System.out.println("After add: " + words);
        }
        System.out.print("Value to remove: ");
        boolean removed = words.remove(input.nextLine());
        System.out.println("Removed by value? " + removed);
        System.out.println("After removal by value: " + words);
        int index = readInt(input, "Index to remove (starts at 0): ");
        if (index >= 0 && index < words.size()) {
            words.remove(index);
        } else {
            System.out.println("Invalid index; no element removed.");
        }
        System.out.println("After removal by index: " + words);
        int replaceIndex = readInt(input, "Index to replace (starts at 0): ");
        System.out.print("Replacement string: ");
        String replacement = input.nextLine();
        if (replaceIndex >= 0 && replaceIndex < words.size()) {
            words.set(replaceIndex, replacement);
        } else {
            System.out.println("Invalid index; no element replaced.");
        }
        System.out.println("After replacement: " + words);
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
