package Jerry.command;

import Jerry.TaskList;
import Jerry.Ui;

public class UnmarkCommand extends Command {
    private int taskIndex;

    public UnmarkCommand(Ui ui, TaskList tasks, int taskIndex) {
        super(ui, tasks);
        this.taskIndex = taskIndex;
    }

    @Override
    public String execute() {
        try {
            tasks.unmark(taskIndex);
            return ui.showUnmark(tasks, taskIndex);
        } catch (IndexOutOfBoundsException e) {
            return ui.showMessage("Task index is out of bounds.");
        } catch (Exception e) {
            return ui.showMessage("Task index must be a number");
        }
    }
}
