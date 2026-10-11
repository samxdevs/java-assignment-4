// A separate object avoids String interning in the weak-reference demo.
public class WeakKey {
    private final String label;

    public WeakKey(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
