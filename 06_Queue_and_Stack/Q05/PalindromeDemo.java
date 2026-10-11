import java.util.*;

public class PalindromeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string (case and spaces are included): ");
        String text = input.nextLine();
        Deque<Character> letters = new ArrayDeque<>();
        for (int i = 0; i < text.length(); i++) {
            letters.addLast(text.charAt(i));
        }
        boolean palindrome = true;
        while (letters.size() > 1) {
            char front = letters.removeFirst();
            char back = letters.removeLast();
            if (front != back) {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
