package iteratorDesignPattern.approach2;

import iteratorDesignPattern.approach2.iterators.PanCakeMenuIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * This is using ArrayList to store menu items.
 * This is not a good approach as we are exposing the underlying data structure
 * of the collection.
 */
public class PancakeHouseMenu {
    List<MenuItem> menuItems;
    public PancakeHouseMenu() {
        menuItems = List.of(
                new MenuItem("Pancake1", "Description1", true, 2.99),
                new MenuItem("Pancake2", "Description2", false, 3.99),
                new MenuItem("Pancake3", "Description3", true, 4.99)
        );
    }

    public Iterator createIterator() {
        return new PanCakeMenuIterator(menuItems);
    }
}
