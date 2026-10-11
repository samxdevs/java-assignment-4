import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProductPricesDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeMap<String, BigDecimal> products = new TreeMap<>();
        int count = readCount(input, "How many products? ");
        for (int i = 0; i < count; i++) {
            System.out.print("Product name: ");
            String name = input.nextLine();
            products.put(name, readMoney(input, "Price: ", true));
        }
        System.out.println("Products sorted by name:");
        for (Map.Entry<String, BigDecimal> entry : products.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    private static BigDecimal readMoney(Scanner input, String prompt, boolean allowZero) {
        while (true) {
            System.out.print(prompt);
            try {
                BigDecimal amount = new BigDecimal(input.nextLine().trim());
                amount = amount.setScale(2, RoundingMode.UNNECESSARY);
                if (amount.signum() > 0 || (allowZero && amount.signum() == 0)) {
                    return amount;
                }
                System.out.println(allowZero ? "Amount cannot be negative." : "Amount must be positive.");
            } catch (NumberFormatException | ArithmeticException e) {
                System.out.println("Enter a decimal amount with at most two decimal places.");
            }
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
