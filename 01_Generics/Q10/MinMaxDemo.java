import java.util.*;

public class MinMaxDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int count = readCount(input, "How many integers? ");
        for (int i = 0; i < count; i++) {
            numbers.add(readInt(input, "Integer " + (i + 1) + ": "));
        }

        ArrayList<String> words = new ArrayList<>();
        int wordCount = readCount(input, "How many strings? ");
        for (int i = 0; i < wordCount; i++) {
            System.out.print("String: ");
            words.add(input.nextLine());
        }
        showMinMax("Integers", numbers);
        showMinMax("Strings", words);
    }

    private static <T extends Comparable<T>> void showMinMax(String label, List<T> values) {
        if (values.isEmpty()) {
            System.out.println(label + ": an empty list has no minimum or maximum.");
            return;
        }
        MinMaxFinder<T> finder = new MinMaxFinder<>(values);
        System.out.println(label + " minimum: " + finder.findMin());
        System.out.println(label + " maximum: " + finder.findMax());
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
