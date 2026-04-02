package commandDesignPattern.approach1.customCommand;

import commandDesignPattern.approach1.Command;
import commandDesignPattern.approach1.customDevices.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
