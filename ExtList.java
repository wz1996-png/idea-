public interface ExtList<E> {

    public void add(E e);

    public void add(int index,E e);

    public E get(int index);

    public E remove(int index);

    public boolean remove(E e);

    public int getSize();
}