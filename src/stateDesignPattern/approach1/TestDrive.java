package stateDesignPattern.approach1;

/**
 * Problems with this approach:
 * 1. The behavior of the machine is defined in a single class, which can lead
 * to a lot of conditional statements and make the code difficult to maintain and extend.
 * 2. If we want to add a new state or change the behavior of an existing
 * state, we would need to modify the main class, which can introduce bugs
 * and make the code less flexible.
 * 3. The code is not following the Open/Closed principle, which states that
 * software entities (classes, modules, functions, etc.) should be open for extension,
 * but closed for modification. In this approach, we are modifying the main class
 * to add new states or change existing behavior, which can lead to bugs
 * and make the code less maintainable.
 *
 * New requirements:
 * 1. We want to add a logic that 10% of the time,
 * the machine will give a bonus gumball to the user, inplace of 1 gumball, it will give 2.
 *
 * For implement that, we need to modify the GumballMachine class,
 * which can introduce bugs and make the code less flexible.
 *
 * Solution: We can use the State design pattern to encapsulate the behavior of each state
 * in separate classes, and allow the machine to transition
 * between states based on certain conditions or events.
 *
 * Like create seperate classes - SoldState, NoQuarterState, HasQuarterState, SoldOutState
 * and implement the behavior of each state in those classes.
 */
public class TestDrive {
    public static void main(String[] args) {
        System.out.println("Gamball Machine with 5 gumballs");
        GumballMachine gumballMachine = new GumballMachine(5);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("-------------------");
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
        System.out.println("-------------------");

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();

        System.out.println(gumballMachine);


    }
}
