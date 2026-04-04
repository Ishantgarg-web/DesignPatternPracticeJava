package iteratorDesignPattern.approach2;

public interface Iterator {
    boolean hasNext();
    MenuItem next();
    void remove();
}
