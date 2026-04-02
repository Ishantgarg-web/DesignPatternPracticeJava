package commandDesignPattern.approach1.customCommand;

import commandDesignPattern.approach1.Command;
import commandDesignPattern.approach1.customDevices.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;
    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.up();
    }
}
