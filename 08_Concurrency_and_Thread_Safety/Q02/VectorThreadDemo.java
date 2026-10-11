import java.util.*;

public class VectorThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        final int count = readCount(input, "How many values should each thread add? ");
        final Vector<Integer> values = new Vector<>();
        Thread first = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < count; i++) {
                    values.add(i);
                }
            }
        });
        Thread second = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < count; i++) {
                    values.add(count + i);
                }
            }
        });
        first.start();
        second.start();
        // join waits for a worker to finish before we inspect the result.
        first.join();
        second.join();
        System.out.println("Expected size: " + (2 * count));
        System.out.println("Actual size: " + values.size());
        System.out.println("All distinct values retained? " + (new HashSet<>(values).size() == 2 * count));
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
