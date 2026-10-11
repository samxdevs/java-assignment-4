import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeSet<Integer> numbers = new TreeSet<Integer>();
        int count = readCount(input, "How many integers? ");
        for (int i = 0; i < count; i++) {
            numbers.add(readInt(input, "Integer " + (i + 1) + ": "));
        }

        System.out.println("Sorted unique elements:");
        for (Integer number : numbers) {
            System.out.println(number);
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
