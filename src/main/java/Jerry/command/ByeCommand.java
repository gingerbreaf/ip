package Jerry.command;

import Jerry.Ui;

public class ByeCommand extends Command {
    public ByeCommand(Ui ui) {
        super(ui, null); // No tasks needed for ByeCommand
    }

    @Override
    public String execute() {
        return ui.showGoodbye();

    }
}
