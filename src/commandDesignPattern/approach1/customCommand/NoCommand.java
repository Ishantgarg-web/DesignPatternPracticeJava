package commandDesignPattern.approach1.customCommand;

import commandDesignPattern.approach1.Command;

/**
 * This is for slots - who does not have any command set. if user pressed button for
 * these slots - no action will perform.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }
}
