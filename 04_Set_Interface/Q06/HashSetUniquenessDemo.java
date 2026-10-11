import java.util.*;

public class HashSetUniquenessDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<String> words = new HashSet<>();
        int count = readCount(input, "How many strings (include duplicates)? ");
        for (int i = 0; i < count; i++) {
            System.out.print("String: ");
            String word = input.nextLine();
            boolean added = words.add(word);
            System.out.println("Added " + word + "? " + added);
        }
        System.out.println("Unique elements (order unspecified): " + words);
        System.out.println("Unique count: " + words.size());
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
