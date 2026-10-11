import java.util.*;

public class MultiMapDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MultiMap<String, String> map = new MultiMap<>();
        int count = readCount(input, "How many key-value pairs (repeat a key)? ");
        for (int i = 0; i < count; i++) {
            System.out.print("Key: ");
            String key = input.nextLine();
            System.out.print("Value: ");
            map.put(key, input.nextLine());
        }
        System.out.println("Values grouped by key:");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
        System.out.print("Key to query: ");
        String key = input.nextLine();
        System.out.println("Values: " + map.get(key));
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
