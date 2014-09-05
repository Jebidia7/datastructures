package datastructures.specs;

/**
 * Created with IntelliJ IDEA.
 * User: u0173910
 * Date: 9/4/14
 * Time: 3:37 PM
 */
public interface List {

    public void insert(Element element);

    public Element first();

    public Element last();

    public Element find(Searchable element);

    public void remove(Element element);

    public Element getAt(int position);

    public void removeAt(int position);

    public void sort();
}
