import java.util.*;

public class SwapDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberCount = readCount(input, "How many integers? ");
        Integer[] numbers = new Integer[numberCount];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = readInt(input, "Integer " + (i + 1) + ": ");
        }
        int wordCount = readCount(input, "How many strings? ");
        String[] words = new String[wordCount];
        for (int i = 0; i < words.length; i++) {
            System.out.print("String " + (i + 1) + ": ");
            words[i] = input.nextLine();
        }
        swapFromInput(input, numbers);
        swapFromInput(input, words);
    }

    public static <T> void swapElements(T[] array, int first, int second) {
        if (first < 0 || first >= array.length || second < 0 || second >= array.length) {
            throw new IndexOutOfBoundsException("Both indexes must be inside the array.");
        }
        T temporary = array[first];
        array[first] = array[second];
        array[second] = temporary;
    }

    private static <T> void swapFromInput(Scanner input, T[] array) {
        System.out.println("Before swap: " + Arrays.toString(array));
        if (array.length == 0) {
            System.out.println("The array is empty; nothing to swap.");
            return;
        }
        int first = readInt(input, "First index (starts at 0): ");
        int second = readInt(input, "Second index (starts at 0): ");
        try {
            swapElements(array, first, second);
            System.out.println("After swap: " + Arrays.toString(array));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
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
