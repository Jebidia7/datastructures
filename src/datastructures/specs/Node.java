package datastructures.specs;

/**
 * Created with IntelliJ IDEA.
 * User: u0173910
 * Date: 9/4/14
 * Time: 3:51 PM
 */
public interface Node {

    public Element element();

    public void setNext(Node next);

    public Node getNext();

    public void setPrevious(Node previous);

    public Node getPrevious();
}
