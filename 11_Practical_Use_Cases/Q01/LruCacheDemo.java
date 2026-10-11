import java.util.*;

public class LruCacheDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int capacity;
        do {
            capacity = readInt(input, "Cache capacity (positive): ");
        } while (capacity <= 0);
        LruCache<String, String> cache = new LruCache<>(capacity);
        while (true) {
            System.out.println("1. Put  2. Get  3. Display  0. Exit");
            int choice = readInt(input, "Choice: ");
            switch (choice) {
                case 1:
                    System.out.print("Key: ");
                    String key = input.nextLine();
                    System.out.print("Value: ");
                    cache.put(key, input.nextLine());
                    System.out.println("Cache from least to most recently used: " + cache);
                    break;
                case 2:
                    System.out.print("Key to read: ");
                    String value = cache.get(input.nextLine());
                    System.out.println(value == null ? "Key not found." : "Value: " + value);
                    break;
                case 3:
                    System.out.println("Cache from least to most recently used: " + cache);
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
