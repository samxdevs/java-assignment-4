import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class MultiMap<K, V> {
    private final HashMap<K, List<V>> values = new HashMap<>();

    public void put(K key, V value) {
        if (!values.containsKey(key)) {
            values.put(key, new ArrayList<V>());
        }
        values.get(key).add(value);
    }

    public List<V> get(K key) {
        if (!values.containsKey(key)) {
            return new ArrayList<>();
        }
        return new ArrayList<>(values.get(key));
    }

    public Set<K> keySet() {
        return new HashSet<>(values.keySet());
    }
}
