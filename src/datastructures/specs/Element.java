package datastructures.specs;

/**
 * Created with IntelliJ IDEA.
 * User: u0173910
 * Date: 9/4/14
 * Time: 3:21 PM
 */
public interface Element<T> extends Comparable<Element<T>>, Searchable {
    // forces compareTo(T o) from Comparable
    public T get();
}
