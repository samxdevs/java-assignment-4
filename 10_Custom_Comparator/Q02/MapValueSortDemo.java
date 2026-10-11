import java.util.*;

public class MapValueSortDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Integer> scores = new HashMap<>();
        int count = readCount(input, "How many key-value pairs? ");
        for (int i = 0; i < count; i++) {
            System.out.print("String key: ");
            String key = input.nextLine();
            scores.put(key, readInt(input, "Integer value: "));
        }
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(scores.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> first, Map.Entry<String, Integer> second) {
                int result = Integer.compare(first.getValue(), second.getValue());
                if (result == 0) {
                    return first.getKey().compareTo(second.getKey());
                }
                return result;
            }
        });
        Map<String, Integer> sorted = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entries) {
            sorted.put(entry.getKey(), entry.getValue());
        }
        System.out.println("Entries by value (lowest first), then by key:");
        for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
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
