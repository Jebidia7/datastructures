package datastructures.specs.impl;

import datastructures.specs.Element;
import datastructures.specs.Iterator;
import datastructures.specs.List;
import datastructures.specs.ListNode;

/**
 * Created with IntelliJ IDEA.
 * User: Jebidia7
 * Date: 9/6/14
 * Time: 1:50 PM
 */
public class ListIterator implements Iterator<ListNode> {

    private List<ListNode> list;
    private ListNode position;

    public ListIterator(List<ListNode> list) {

        this.list = list;
    }

    @Override
    public boolean hasNext() {

        return (position.getNext() != null);
    }

    @Override
    public ListNode next() {
        
        if(!hasNext()) {
            // already at last element in the list
            throw new RuntimeException("Already at the end of the list.");
        }

        position = position.getNext();

        return position;
    }

    @Override
    public boolean hasPrevious() {

        return (position.getPrevious() != null);
    }

    @Override
    public ListNode previous() {

        if(!hasPrevious()) {
            // already at last element in the list
            throw new RuntimeException("Alreaty at the beginning of the list.");
        }

        position = position.getPrevious();

        return position;
    }

    @Override
    public void reset() {

        position = list.first();
    }

    @Override
    public void end() {

        position = list.last();
    }

    @Override
    public void insertBefore(Element<ListNode> element) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void insertAfter(Element<ListNode> element) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
