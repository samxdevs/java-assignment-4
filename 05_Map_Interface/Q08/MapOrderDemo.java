import java.util.*;

public class MapOrderDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedMap = new LinkedHashMap<>();
        int count = readCount(input, "How many key-value pairs? ");
        for (int i = 0; i < count; i++) {
            int key = readInt(input, "Integer key: ");
            System.out.print("String value: ");
            String value = input.nextLine();
            hashMap.put(key, value);
            linkedMap.put(key, value);
        }
        System.out.println("HashMap: order is not guaranteed");
        printMap(hashMap);
        System.out.println("LinkedHashMap: insertion order");
        printMap(linkedMap);
    }

    private static void printMap(Map<Integer, String> map) {
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
