import java.util.*;

public class BoundedTypeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberBox<Integer> box = new NumberBox<>(readInt(input, "Enter an integer: "));
        NumberBox<Double> decimalBox = new NumberBox<>(12.5);
        System.out.println("Integer box: " + box.getNumber());
        System.out.println("As a double: " + box.getDoubleValue());
        System.out.println("Double box: " + decimalBox.getNumber());
        // NumberBox<String> is not allowed because String is not a Number.
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
}
