package datastructures.specs;

/**
 * Created with IntelliJ IDEA.
 * User: Jebidia7
 * Date: 9/7/14
 * Time: 3:55 PM
 */
public interface Tree<T> {

    public T find(Searchable element);

    public void insert(T element);

    public void delete(T element);
}
