package datastructures.specs.impl;

import datastructures.specs.Element;
import datastructures.specs.ListNode;

/**
 * Created with IntelliJ IDEA.
 * User: Jebidia7
 * Date: 9/5/14
 * Time: 11:03 AM
 */
public class IntNode implements ListNode {

    private Element<Integer> element;
    private ListNode next;
    private ListNode previous;

    public IntNode(IntElement element) {

        this.element = element;
    }

    @Override
    public Element element() {

        return element;
    }

    @Override
    public void setNext(ListNode next) {

        this.next = next;
    }

    @Override
    public ListNode getNext() {

        return next;
    }

    @Override
    public void setPrevious(ListNode previous) {

        this.previous = previous;
    }

    @Override
    public ListNode getPrevious() {

        return previous;
    }
}
