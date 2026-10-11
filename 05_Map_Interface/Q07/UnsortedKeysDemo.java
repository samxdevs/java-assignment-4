import java.util.*;

public class UnsortedKeysDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeMap<Integer, String> map = new TreeMap<>();
        int count = readCount(input, "How many key-value pairs? ");
        for (int i = 0; i < count; i++) {
            int key = readInt(input, "Integer key: ");
            System.out.print("String value: ");
            map.put(key, input.nextLine());
        }
        System.out.println("Entries in ascending key order:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
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
