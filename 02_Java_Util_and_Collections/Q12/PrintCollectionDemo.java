import java.util.*;

public class PrintCollectionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        int count = readCount(input, "How many strings? ");
        for (int i = 0; i < count; i++) {
            System.out.print("String " + (i + 1) + ": ");
            words.add(input.nextLine());
        }

        List<String> list = words;
        Set<String> set = new LinkedHashSet<>(words);
        Queue<String> queue = new LinkedList<>(words);
        System.out.println("List:");
        printElements(list);
        System.out.println("Set (unique values):");
        printElements(set);
        System.out.println("Queue:");
        printElements(queue);
        // The method also accepts collections with another element type.
        System.out.println("Integer collection:");
        printElements(Arrays.asList(10, 20, 30));
    }

    public static <T> void printElements(Collection<T> items) {
        for (T item : items) {
            System.out.println(item);
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
