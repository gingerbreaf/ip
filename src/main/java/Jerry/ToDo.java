package Jerry;

/**
 * Represents a to-do task in the chatbot application. A to-do task is a basic task with a description.
 */
public class ToDo extends Task {

    /**
     * Creates a to-do task with the specified description.
     *
     * @param description The description of the to-do task.
     */
    public ToDo(String description) {
        super(description);
    }

    @Override
    public String getTypeIcon() {
        return "T";
    }

    @Override
    public String toFileFormat() {
        return "T | " + (isDone? 1 : 0) + " | " + description;
    }
}

