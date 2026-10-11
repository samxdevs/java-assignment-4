import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        int count = readCount(input, "How many strings? ");
        for (int i = 0; i < count; i++) {
            System.out.print("String " + (i + 1) + ": ");
            words.add(input.nextLine());
        }

        System.out.println("Stored elements:");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("Number of elements: " + words.size());
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
