import java.util.*;

public class ListIterationDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int count = readCount(input, "How many integers? ");
        for (int i = 0; i < count; i++) {
            numbers.add(readInt(input, "Integer " + (i + 1) + ": "));
        }

        System.out.println("Simple for loop:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("Enhanced for loop:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println("While loop with Iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
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
