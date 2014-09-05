package datastructures.specs.impl;

import datastructures.specs.Element;
import datastructures.specs.Node;

/**
 * Created with IntelliJ IDEA.
 * User: Jebidia7
 * Date: 9/5/14
 * Time: 11:03 AM
 */
public class IntNode implements Node {

    private IntElement element;
    private Node next;
    private Node previous;

    public IntNode(IntElement element) {

        this.element = element;
    }

    @Override
    public Element element() {

        return element;
    }

    @Override
    public void setNext(Node next) {

        this.next = next;
    }

    @Override
    public Node getNext() {

        return next;
    }

    @Override
    public void setPrevious(Node previous) {

        this.previous = previous;
    }

    @Override
    public Node getPrevious() {

        return previous;
    }
}
