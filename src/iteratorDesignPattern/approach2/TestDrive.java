package iteratorDesignPattern.approach2;

/**
 * To fix the problems of approach1 - we will use the Iterator design pattern to hide the underlying data structure of the collection.
 * We will create an interface called Iterator and then implement it in DinerMenuIterator and PancakeIterator.
 *
 * This solves our problems as we are not exposing the underlying data structure
 * of the collection and we are also not violating the Single Responsibility Principle
 * as the Waitress class is only responsible for printing the menu items
 * and not iterating over the menu items of both the menus.
 *
 * What is High Cohesion and Low Cohesion?
 * High Cohesion: A class is said to have high cohesion if it has a single responsibility
 * and all its methods are related to that responsibility.
 * High Cohesion is desirable as it makes the class easier to understand and maintain.
 *
 */
public class TestDrive {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

        Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu);
        waitress.printMenu();
    }
}
