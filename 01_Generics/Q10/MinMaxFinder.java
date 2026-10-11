import java.util.ArrayList;
import java.util.List;

public class MinMaxFinder<T extends Comparable<T>> {
    private final List<T> values;

    public MinMaxFinder(List<T> values) {
        if (values == null || values.isEmpty()) {
            throw new IllegalArgumentException("The list must not be empty.");
        }
        this.values = new ArrayList<>(values);
    }

    public T findMin() {
        T minimum = values.get(0);
        for (T value : values) {
            if (value.compareTo(minimum) < 0) {
                minimum = value;
            }
        }
        return minimum;
    }

    public T findMax() {
        T maximum = values.get(0);
        for (T value : values) {
            if (value.compareTo(maximum) > 0) {
                maximum = value;
            }
        }
        return maximum;
    }
}
