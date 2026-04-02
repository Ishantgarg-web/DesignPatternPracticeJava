package commandDesignPattern.approach1.customCommand;

import commandDesignPattern.approach1.Command;
import commandDesignPattern.approach1.customDevices.GarageDoor;

public class GarageDoorCloseCommand implements Command {
    GarageDoor garageDoor;
    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
