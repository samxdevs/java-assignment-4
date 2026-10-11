import java.util.*;

public class TicketBookingDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> customers = new LinkedList<>();
        while (true) {
            System.out.println("\n        1. Join queue  2. Book next ticket  3. Display queue  0. Exit");
            int choice = readInt(input, "Choice: ");
            switch (choice) {
                case 1:
                    System.out.print("Customer name: ");
                    customers.offer(input.nextLine());
                    System.out.println("Customer joined the queue.");
                    break;
                case 2:
                    String customer = customers.poll();
                    if (customer == null) {
                        System.out.println("No customers waiting.");
                    } else {
                        System.out.println("Ticket booked for: " + customer);
                    }
                    break;
                case 3:
                    System.out.println("Waiting customers: " + customers);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice.");
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
