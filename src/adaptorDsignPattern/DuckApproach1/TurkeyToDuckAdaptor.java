package adaptorDsignPattern.DuckApproach1;

public class TurkeyToDuckAdaptor implements Duck{
    Turkey turkey;
    public TurkeyToDuckAdaptor(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        // suppose duck are flying 5 times faster than turkey.
        for (int i=0;i<5;i++) {
            turkey.fly();
        }
    }
}
