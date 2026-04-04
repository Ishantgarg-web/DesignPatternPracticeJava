package iteratorDesignPattern.approach2.iterators;

import iteratorDesignPattern.approach2.MenuItem;
import iteratorDesignPattern.approach2.Iterator;

import java.util.List;

public class PanCakeMenuIterator implements Iterator {
    List<MenuItem> menuItems;
    int position = 0;

    public PanCakeMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.size()) {
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }

    @Override
    public void remove() {
        menuItems.remove(position);
        position--;
    }
}
