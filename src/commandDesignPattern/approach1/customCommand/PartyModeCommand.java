package commandDesignPattern.approach1.customCommand;

import commandDesignPattern.approach1.Command;

public class PartyModeCommand implements Command {

    Command[] commands;
    public PartyModeCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command: commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command: commands) {
            command.undo();
        }
    }
}
