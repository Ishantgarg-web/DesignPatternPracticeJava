package adaptorDsignPattern.DuckApproach1;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Turkey - Gobble, Gobble");
    }

    @Override
    public void fly() {
        System.out.println("Turkey - Fly");
    }
}
