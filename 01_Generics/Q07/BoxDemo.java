import java.util.*;

public class BoxDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Box<String> stringBox = new Box<>();
        Box<Integer> integerBox = new Box<>();
        System.out.print("Enter a string for the box: ");
        stringBox.addItem(input.nextLine());
        integerBox.addItem(readInt(input, "Enter an integer for the box: "));
        System.out.println("String box contains: " + stringBox.getItem());
        System.out.println("Integer box contains: " + integerBox.getItem());
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
