import java.util.*;

public class EmployeeMapDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> employees = new HashMap<>();
        int count = readCount(input, "How many employees? ");
        for (int i = 0; i < count; i++) {
            int id = readInt(input, "Employee ID: ");
            System.out.print("Employee name: ");
            employees.put(id, input.nextLine());
        }
        int searchId = readInt(input, "Employee ID to check: ");
        System.out.println("Key exists? " + employees.containsKey(searchId));
        System.out.println("Using keySet:");
        for (Integer id : employees.keySet()) {
            System.out.println(id + " -> " + employees.get(id));
        }
        System.out.println("Using entrySet:");
        for (Map.Entry<Integer, String> employee : employees.entrySet()) {
            System.out.println(employee.getKey() + " -> " + employee.getValue());
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
