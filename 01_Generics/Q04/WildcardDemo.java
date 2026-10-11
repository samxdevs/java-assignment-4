import java.util.*;

public class WildcardDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int count = readCount(input, "How many integers? ");
        for (int i = 0; i < count; i++) {
            numbers.add(readInt(input, "Integer " + (i + 1) + ": "));
        }

        System.out.println("Sum from extends wildcard: " + sum(numbers));
        List<Number> destination = new ArrayList<>();
        addIntegers(destination, numbers);
        System.out.println("Numbers added through super wildcard: " + destination);
    }

    // Read Numbers from a list of Number or any Number subclass.
    public static double sum(List<? extends Number> values) {
        double total = 0;
        for (Number value : values) {
            total += value.doubleValue();
        }
        return total;
    }

    // Write Integers into a list of Integer, Number, or Object.
    public static void addIntegers(List<? super Integer> destination, List<Integer> values) {
        for (Integer value : values) {
            destination.add(value);
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
