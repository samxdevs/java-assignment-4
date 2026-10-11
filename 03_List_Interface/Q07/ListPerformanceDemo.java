import java.util.*;

public class ListPerformanceDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = readCount(input, "Number of elements (try 5000): ");
        measure("ArrayList", new ArrayList<Integer>(), count);
        measure("LinkedList", new LinkedList<Integer>(), count);
        System.out.println("Timings vary. This is a simple classroom comparison.");
    }

    private static void measure(String name, List<Integer> list, int count) {
        long start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            list.add(0, i);
        }
        long addTime = System.nanoTime() - start;

        // Prepare the same values outside the timing block.
        list.clear();
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
        start = System.nanoTime();
        while (!list.isEmpty()) {
            list.remove(list.size() / 2);
        }
        long removeTime = System.nanoTime() - start;

        for (int i = 0; i < count; i++) {
            list.add(i);
        }
        long sum = 0;
        start = System.nanoTime();
        for (Integer value : list) {
            sum += value;
        }
        long iterationTime = System.nanoTime() - start;
        System.out.println(name + ":");
        System.out.println("  Add at beginning: " + addTime + " ns");
        System.out.println("  Remove from middle: " + removeTime + " ns");
        System.out.println("  Iterate: " + iterationTime + " ns; sum = " + sum);
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
