package commandDesignPattern.approach1;

import commandDesignPattern.approach1.customCommand.*;
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
        remote.setCommand(1, garageDoorOpenCommand, garageDoorCloseCommand);
        // Below is using the Lambda expressions -> that will reduce the number of classes.
        remote.onButtonWasPressed(0);
        remote.offButtonWasPressed(1);
        remote.undoButton();
        remote.onButtonWasPressed(2);

        // setting party mode to slot 2
        System.out.println("Party Mode");
        PartyModeCommand partyModeOnCommand = new PartyModeCommand(new Command[] {lightOnCommand, garageDoorOpenCommand});
        PartyModeCommand partyModeOffCommand = new PartyModeCommand(new Command[] {lightOffCommand, garageDoorCloseCommand});
        remote.setCommand(2, partyModeOnCommand, partyModeOffCommand);
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
