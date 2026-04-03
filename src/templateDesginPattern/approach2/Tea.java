package templateDesginPattern.approach2;

public class Tea extends CaffeineBeverage{
    @Override
    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    private void addLemon() {
        System.out.println("Adding Lemon");
    }

    private void steepTeaBag() {
        System.out.println("Steeping the tea");
    }
}
