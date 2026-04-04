package iteratorDesignPattern.approach2;

import java.util.ArrayList;

/**
 * Waiteress is responsible for printing the menu items of both the menus.
 * It is using the getMenuItems() method of both the menus
 * to get the menu items and print them.
 * This is not a good approach as we are exposing the underlying data structure.
 *
 * Other problems: if we want to add a new menu,
 * we have to modify the Waitress class
 * to add a new method to get the menu items of the new menu and print them.
 *
 * We are iterating over the menu items of both the menus in the Waitress class,
 * which is not a good approach as we are exposing the underlying data structure of the collection.
 * We are also violating the Single Responsibility Principle as the
 * Waitress class is responsible for both printing the menu items
 * and iterating over the menu items of both the menus.
 */
public class Waitress {
    private DinerMenu dinerMenu;
    private PancakeHouseMenu pancakeHouseMenu;

    public Waitress(DinerMenu dinerMenu, PancakeHouseMenu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu() {
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        while(dinerMenuIterator.hasNext()) {
            MenuItem menuItem = dinerMenuIterator.next();
            print(menuItem);
        }
        while(pancakeHouseMenuIterator.hasNext()) {
            MenuItem menuItem = pancakeHouseMenuIterator.next();
            print(menuItem);
        }
    }

    private void print(MenuItem menuItem) {
        System.out.print(menuItem.getName() + ", ");
        System.out.print(menuItem.getPrice() + " -- ");
        System.out.println(menuItem.getDescription());
    }
}
