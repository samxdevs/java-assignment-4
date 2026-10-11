import java.util.*;

public class PairDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = input.nextLine();
        int age = readInt(input, "Enter an age: ");
        Pair<String, Integer> person = new Pair<>(name, age);
        System.out.println("Original pair: " + person.getFirst() + ", " + person.getSecond());
        System.out.print("Enter a new name: ");
        person.setFirst(input.nextLine());
        person.setSecond(readInt(input, "Enter a new age: "));
        System.out.println("Updated pair: " + person.getFirst() + ", " + person.getSecond());
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
