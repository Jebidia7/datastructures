package datastructures.ch5;

/**
 * Created with IntelliJ IDEA.
 * User: u0173910
 * Date: 9/4/14
 * Time: 2:18 PM
 */
public class Node<E> {

    private E element;
    private Node<E> next;

    public Node(E element) {

        this.element = element;
    }

    public E getElement() {

        return element;
    }

    public void setNext(Node<E> next) {

        this.next = next;
    }

    public Node<E> getNext() {

        return next;
    }
}
