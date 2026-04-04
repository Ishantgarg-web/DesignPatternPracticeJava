package iteratorDesignPattern.approach2.iterators;

import iteratorDesignPattern.approach2.MenuItem;
import iteratorDesignPattern.approach2.Iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position = 0;
    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.length || menuItems[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }

    @Override
    public void remove() {
        // Arrays will not support remove operation, So we can throw UnsupportedOperationException
        throw new UnsupportedOperationException("Remove operation is not supported by DinerMenuIterator");
    }
}
