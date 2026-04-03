package templateDesginPattern.approach2;

public class Coffee extends CaffeineBeverage{
    @Override
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    private void addSugarAndMilk() {
        System.out.println("Adding sugar and milk");
    }

    private void brewCoffeeGrinds() {
        System.out.println("Dripping coffee through filter");
    }
}
