import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankingApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, BigDecimal> accounts = new HashMap<>();
        while (true) {
            System.out.println("1. Create account  2. Deposit  3. Withdraw  4. Balance  5. Display  0. Exit");
            int choice = readInt(input, "Choice: ");
            if (choice == 0) {
                return;
            }
            if (choice == 5) {
                System.out.println("Accounts: " + accounts);
                continue;
            }
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice.");
                continue;
            }
            System.out.print("Customer ID: ");
            String id = input.nextLine().trim();
            if (id.isEmpty()) {
                System.out.println("Customer ID cannot be blank.");
                continue;
            }
            if (choice == 1) {
                if (accounts.containsKey(id)) {
                    System.out.println("That account already exists.");
                } else {
                    BigDecimal initial = readMoney(input, "Opening balance: ", true);
                    accounts.put(id, initial);
                    System.out.println("Account created. Balance: " + initial);
                }
                continue;
            }
            if (!accounts.containsKey(id)) {
                System.out.println("Account not found.");
                continue;
            }
            BigDecimal balance = accounts.get(id);
            if (choice == 2) {
                BigDecimal amount = readMoney(input, "Deposit amount: ", false);
                accounts.put(id, balance.add(amount));
            } else if (choice == 3) {
                BigDecimal amount = readMoney(input, "Withdrawal amount: ", false);
                if (amount.compareTo(balance) > 0) {
                    System.out.println("Insufficient balance.");
                } else {
                    accounts.put(id, balance.subtract(amount));
                }
            }
            System.out.println("Balance: " + accounts.get(id));
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
}
