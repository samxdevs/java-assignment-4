import java.util.*;

public class BookCatalogApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, String> books = new HashMap<>();
        while (true) {
            System.out.println("1. Add/update book  2. Search by title  3. Display catalog  0. Exit");
            int choice = readInt(input, "Choice: ");
            switch (choice) {
                case 1:
                    System.out.print("Book title: ");
                    String title = input.nextLine();
                    System.out.print("Author name: ");
                    books.put(title, input.nextLine());
                    System.out.println("Book saved.");
                    break;
                case 2:
                    System.out.print("Exact title to search: ");
                    String author = books.get(input.nextLine());
                    System.out.println(author == null ? "Book not found." : "Author: " + author);
                    break;
                case 3:
                    if (books.isEmpty()) {
                        System.out.println("Catalog is empty.");
                    }
                    for (Map.Entry<String, String> entry : books.entrySet()) {
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
