package datastructures.specs;

/**
 * Created with IntelliJ IDEA.
 * User: Jebidia7
 * Date: 9/5/14
 * Time: 2:36 PM
 */
public interface Iterator<T> {

    public boolean hasNext();

    public T next();

    public boolean hasPrevious();

    public T previous();

    public void reset();

    public void end();

    public void insertBefore(Element<T> element);

    public void insertAfter(Element<T> element);
}