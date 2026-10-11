import java.util.*;
import java.lang.ref.WeakReference;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        WeakHashMap<WeakKey, String> map = new WeakHashMap<>();
        WeakKey retainedKey = new WeakKey("Retained key");
        WeakKey releasedKey = new WeakKey("Released key");
        map.put(retainedKey, "This entry should remain");
        map.put(releasedKey, "This entry may disappear");
        System.out.println("Size before releasing the key: " + map.size());
        WeakReference<WeakKey> reference = new WeakReference<>(releasedKey);
        releasedKey = null;
        // Garbage collection is not guaranteed, even after System.gc().
        for (int attempt = 0; attempt < 10 && reference.get() != null; attempt++) {
            System.gc();
            Thread.sleep(50);
            map.size(); // Access the map so it can clear stale entries.
        }
        System.out.println("Size after GC requests: " + map.size());
        System.out.println("Retained key still present? " + map.containsKey(retainedKey));
        if (reference.get() == null) {
            System.out.println("The released key was garbage-collected.");
        } else {
            System.out.println("The released key was not collected during this run. GC timing varies.");
        }
        System.out.println("Remaining entries: " + map);
    }
}
