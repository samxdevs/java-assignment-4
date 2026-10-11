import java.util.*;

public class StudentComparatorDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        int count = readCount(input, "How many students? ");
        for (int i = 0; i < count; i++) {
            System.out.print("Student name: ");
            String name = input.nextLine();
            int marks = readInt(input, "Marks: ");
            students.add(new Student(name, marks));
        }
        Comparator<Student> byMarks = new Comparator<Student>() {
            @Override
            public int compare(Student first, Student second) {
                int result = Integer.compare(second.getMarks(), first.getMarks());
                if (result == 0) {
                    return first.getName().compareTo(second.getName());
                }
                return result;
            }
        };
        Collections.sort(students, byMarks);
        System.out.println("Students by marks (highest first), then by name:");
        for (Student student : students) {
            System.out.println(student);
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
