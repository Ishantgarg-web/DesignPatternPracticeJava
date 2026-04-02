package adaptorDsignPattern.DuckApproach1;

public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Duck - quack, quack!!");
    }

    @Override
    public void fly() {
        System.out.println("Duck - fly!!");
    }
}
