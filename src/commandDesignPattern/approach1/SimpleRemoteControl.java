package commandDesignPattern.approach1;

import commandDesignPattern.approach1.customCommand.NoCommand;

public class SimpleRemoteControl {
    Command onCommands[];
    Command offCommands[];
    Command undoCommand;

    public SimpleRemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        for (int i=0;i<7;i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
        undoCommand = new NoCommand();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButton() {
        undoCommand.undo();
    }
}
