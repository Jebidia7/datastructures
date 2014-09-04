package datastructures.specs;

/**
 * Created with IntelliJ IDEA.
 * User: u0173910
 * Date: 9/4/14
 * Time: 3:31 PM
 */
public interface Stack<Element> {

    public void push(Element element);

    public Element pop();

    public Element peek();

    public boolean size();
}
