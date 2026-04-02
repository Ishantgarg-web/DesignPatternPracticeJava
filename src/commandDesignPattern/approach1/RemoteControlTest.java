package commandDesignPattern.approach1;

import commandDesignPattern.approach1.customCommand.GarageDoorCloseCommand;
import commandDesignPattern.approach1.customCommand.GarageDoorOpenCommand;
import commandDesignPattern.approach1.customCommand.LightOffCommand;
import commandDesignPattern.approach1.customCommand.LightOnCommand;
import commandDesignPattern.approach1.customDevices.GarageDoor;
import commandDesignPattern.approach1.customDevices.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        remote.setCommand(0, lightOnCommand, lightOffCommand);
//        remote.setCommand(1, garageDoorOpenCommand, garageDoorCloseCommand);
        // Below is using the Lambda expressions -> that will reduce the number of classes.
        remote.setCommand(1, garageDoor::up, garageDoor::down);
        remote.onButtonWasPressed(0);
        remote.offButtonWasPressed(1);
        remote.onButtonWasPressed(2);
    }
}

/**
 * Problem with this approach:
 * Today, we have seven slots that each one correspond to some work.
 * How many classes we will have? - Multiple Garage classes for each work.
 * In future, we will have new vendor - Creating new more classes and then update in
 *      RemoteControlTest class for setting each one in the seven slots.
 *
 * So, this is not aligned with principal - It is not closed for extension.
 */
