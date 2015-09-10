package datastructures.specs;

/**
 * Created with IntelliJ IDEA.
 * User: u0173910
 * Date: 9/4/14
 * Time: 3:37 PM
 */
public interface List<T> {

    public void insert(T element);

    public T first();

    public T last();

    public T find(Searchable element);

    public void remove(T element);

    public T getAt(int position);

    public void removeAt(int position);

    public void sort();

    public Iterator<T> iterator();
}
