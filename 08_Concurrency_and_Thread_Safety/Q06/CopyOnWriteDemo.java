import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

public class CopyOnWriteDemo {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        final CopyOnWriteArrayList<String> words = new CopyOnWriteArrayList<>();
        int count = readCount(input, "How many starting strings? ");
        for (int i = 0; i < count; i++) {
            System.out.print("String: ");
            words.add(input.nextLine());
        }
        System.out.print("String to add in the writer thread: ");
        final String added = input.nextLine();
        System.out.print("String to remove in the writer thread: ");
        final String removed = input.nextLine();
        System.out.println("Original list: " + words);
        // This iterator keeps the original snapshot, even after later changes.
        final Iterator<String> snapshot = words.iterator();
        final CountDownLatch start = new CountDownLatch(1);
        Thread reader = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    start.await();
                    while (snapshot.hasNext()) {
                        System.out.println("Snapshot item: " + snapshot.next());
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        Thread writer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    start.await();
                    words.add(added);
                    words.remove(removed);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        reader.start();
        writer.start();
        start.countDown();
        reader.join();
        writer.join();
        System.out.println("List after modification: " + words);
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
