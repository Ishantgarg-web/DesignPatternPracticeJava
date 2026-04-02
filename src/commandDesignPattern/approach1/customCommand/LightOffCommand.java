package commandDesignPattern.approach1.customCommand;

import commandDesignPattern.approach1.Command;
import commandDesignPattern.approach1.customDevices.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
