import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

public class ConcurrentMapDemo {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        final int count = readCount(input, "Counter increments per worker: ");
        final ConcurrentHashMap<String, Integer> counters = new ConcurrentHashMap<>();
        counters.put("visits", 0);
        final CountDownLatch start = new CountDownLatch(1);
        Runnable update = new Runnable() {
            @Override
            public void run() {
                try {
                    start.await();
                    for (int i = 0; i < count; i++) {
                        // merge performs this increment atomically for the key.
                        counters.merge("visits", 1, Integer::sum);
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };
        Thread first = new Thread(update);
        Thread second = new Thread(update);
        Thread reader = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    start.await();
                    for (Map.Entry<String, Integer> entry : counters.entrySet()) {
                        System.out.println("Value observed during updates: " + entry);
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        first.start();
        second.start();
        reader.start();
        start.countDown();
        first.join();
        second.join();
        reader.join();
        System.out.println("Expected final visits: " + (2 * count));
        System.out.println("Actual final visits: " + counters.get("visits"));
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
