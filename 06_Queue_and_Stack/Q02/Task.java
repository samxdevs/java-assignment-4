public class Task {
    private final String description;
    private final int priority;
    private final int sequence;

    public Task(String description, int priority, int sequence) {
        this.description = description;
        this.priority = priority;
        this.sequence = sequence;
    }

    public int getPriority() {
        return priority;
    }

    public int getSequence() {
        return sequence;
    }

    @Override
    public String toString() {
        return description + " (priority " + priority + ")";
    }
}
