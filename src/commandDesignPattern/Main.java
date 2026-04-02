package commandDesignPattern;

/**
 * problem statement: Create a remote control and it features seven programmable slots
 * (each can be assigned to a different household device) along with corresponding on/off
 * buttons for each. The remote also has a global undo button.
 *
 * Idea: We have to design the remote in such a way - it should not aware of internal
 * working - how these devices operate.
 *
 * Command Pattern: it allows you to decouple the requestor of an action from the object
 * that actually performs the action.
 * Example: A remote control just saying pressing slot1 on() button -> turn the balcony
 * light on, and same for other slots. -> but it should not worry about how it is
 * encapsulated from vendor classes.
 *
 * How we can implement this?
 * Think of a Restaurant,
 * Customer -> createOrder() -> Waiteress takeOrder() -> Waitress calls orderUp() on
 * order counter -> and that orders slip tells like makeBurger()..., and chef cooks them
 * and give output.
 *
 * In the same manner,
 * Client -> Create command object() -> Command(have execute() method) -> setCommand()
 * to Invoker(have setCommand() method)
 * Client calls Invoker to execute the command and it performed actions to the Receiver.
 *
 * Mapping between Restaurant and Command Pattern
 * Waitress -> Invoker
 * Cook -> Receiver
 * orderUp() -> execute()
 * Order -> Command
 * Customer -> client
 * takeOrder() -> setCommand()
 */
public class Main {

}
