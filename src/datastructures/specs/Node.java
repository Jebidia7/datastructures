package datastructures.specs;

/**
 * Created with IntelliJ IDEA.
 * User: u0173910
 * Date: 9/4/14
 * Time: 3:51 PM
 */
public interface Node<Element> {

    public Element element();

    public void setNext(Node<Element> node);

    public Node<Element> getNext();

    public void setPrevious(Node<Element> node);

    public Node<Element> getPrevious();
}
