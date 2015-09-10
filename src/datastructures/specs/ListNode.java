package datastructures.specs;

/**
 * Created with IntelliJ IDEA.
 * User: u0173910
 * Date: 9/4/14
 * Time: 3:51 PM
 */
public interface ListNode {

    public Element element();

    public void setNext(ListNode next);

    public ListNode getNext();

    public void setPrevious(ListNode previous);

    public ListNode getPrevious();
}
