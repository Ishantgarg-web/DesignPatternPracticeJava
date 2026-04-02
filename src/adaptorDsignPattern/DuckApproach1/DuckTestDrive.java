package adaptorDsignPattern.DuckApproach1;

/**
 * Problem statement: We have two interfaces - Duck and Turkey.
 * We have to convert Turkey into Duck.
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkeyDuck = new WildTurkey();
        testDuck(mallardDuck);
        wildTurkeyDuck.gobble();
        wildTurkeyDuck.fly();

        // Converting Turkey to Duck
        Duck turkeyToDuck = new TurkeyToDuckAdaptor(wildTurkeyDuck);
        testDuck(turkeyToDuck);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
