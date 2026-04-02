package adaptorDsignPattern.JavaPracticleExample;

public class EnumerationToIterator implements Iterator{
    Enumeration enumeration;
    public EnumerationToIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public Object remove() {
        throw new UnsupportedOperationException();
    }
}
