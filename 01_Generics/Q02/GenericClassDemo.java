import java.util.*;

public class GenericClassDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Container<String> text = new Container<>();
        Container<Integer> number = new Container<>();
        System.out.print("Enter some text: ");
        text.setValue(input.nextLine());
        number.setValue(readInt(input, "Enter an integer: "));
        System.out.println("String container: " + text.getValue());
        System.out.println("Integer container: " + number.getValue());
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
