package templateDesginPattern.approach1;

/**
 * Problem with this approach is: In both coffee and tea, some duplicated code is
 * present. That we can take in as a common.
 */
public class TestDrive {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();
        coffee.prepareRecipe();
        tea.prepareRecipe();
    }
}
