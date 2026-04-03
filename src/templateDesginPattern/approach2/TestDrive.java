package templateDesginPattern.approach2;

/**
 * This solves approach1 problem - reduced some duplicated code.
 * Still, we are defining part of code in subclassed - that can also abstract.
 */
public class TestDrive {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();
        coffee.prepareRecipe();
        tea.prepareRecipe();
    }
}
