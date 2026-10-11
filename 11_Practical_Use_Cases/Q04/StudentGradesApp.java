import java.util.*;

public class StudentGradesApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeMap<String, String> grades = new TreeMap<>();
        while (true) {
            System.out.println("1. Add/update grade  2. Remove student  3. Query grade  4. Display  0. Exit");
            int choice = readInt(input, "Choice: ");
            switch (choice) {
                case 1:
                    System.out.print("Student name: ");
                    String name = input.nextLine();
                    System.out.print("Grade: ");
                    grades.put(name, input.nextLine());
                    System.out.println("Grade saved.");
                    break;
                case 2:
                    System.out.print("Student to remove: ");
                    String removed = grades.remove(input.nextLine());
                    System.out.println(removed == null ? "Student not found." : "Student removed.");
                    break;
                case 3:
                    System.out.print("Student to query: ");
                    String grade = grades.get(input.nextLine());
                    System.out.println(grade == null ? "Student not found." : "Grade: " + grade);
                    break;
                case 4:
                    if (grades.isEmpty()) {
                        System.out.println("No grades stored.");
                    }
                    for (Map.Entry<String, String> entry : grades.entrySet()) {
                        System.out.println(entry.getKey() + " -> " + entry.getValue());
                    }
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
