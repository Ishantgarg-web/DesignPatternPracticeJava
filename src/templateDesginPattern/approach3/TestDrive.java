package templateDesginPattern.approach3;

/**
 * This solves approach2 problem - reduced further duplicated code.
 */
public class TestDrive {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();
        coffee.prepareRecipe();
        tea.prepareRecipe();
    }
}
