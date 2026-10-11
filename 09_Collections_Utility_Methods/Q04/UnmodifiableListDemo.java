import java.util.*;

public class UnmodifiableListDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        int count = readCount(input, "How many strings? ");
        for (int i = 0; i < count; i++) {
            System.out.print("String " + (i + 1) + ": ");
            words.add(input.nextLine());
        }

        List<String> readOnly = Collections.unmodifiableList(words);
        System.out.println("Unmodifiable view: " + readOnly);
        System.out.print("String to attempt to add: ");
        String value = input.nextLine();
        try {
            readOnly.add(value);
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught UnsupportedOperationException: cannot modify this view.");
        }
        System.out.println("View after rejected add: " + readOnly);
        words.add(value);
        System.out.println("View after adding through backing list: " + readOnly);
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
