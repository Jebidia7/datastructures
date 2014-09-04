package datastructures.specs;

/**
 * Created with IntelliJ IDEA.
 * User: u0173910
 * Date: 9/4/14
 * Time: 3:35 PM
 */
public interface Queue<Element> {

    public void queue(Element element);

    public Element dequeue();

    public Element size();
}
