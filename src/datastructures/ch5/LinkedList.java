package datastructures.ch5;

/**
 * Created with IntelliJ IDEA.
 * User: u0173910
 * Date: 9/4/14
 * Time: 2:24 PM
 */
public class LinkedList<E> {

    private Node<E> head;
    private Node<E> tail;

    public LinkedList() {

    }

    public boolean isEmpty() {

        return (head == null);
    }

    public void insertFirst(E element) {

        Node<E> node = new Node<E>(element);
        node.setNext(head);
        if(isEmpty()) {
            tail = node;
        }
        head = node;
    }

    public void insertLast(E element) {

        Node<E> node = new Node<E>(element);
        if(isEmpty()) {
            head = node;
        }
        else {
            tail.setNext(node);
        }
        tail = node;
    }

    public Node<E> removeFirst() {

        Node<E> removed = head;
        head = head.getNext();
        removed.setNext(null);

        if(isEmpty()) {
            tail = null;
        }

        return removed;
    }

    public Node<E> removeLast() {

        Node<E> removed = tail;
        if(head == removed) {
            head = null;
            tail = head;
        }
        else if(head.getNext() == removed) {
            tail = head;
        }
        else {
            Node<E> temp = head.getNext();
            while(temp.getNext() != null) {
                tail = temp;
            }
        }

        return  removed;
    }

    public void insertAfter(E element, Node<E> node) {

        Node<E> newNode = new Node<E>(element);
        newNode.setNext(node.getNext());
        node.setNext(newNode);
    }

    public Node<E> find(E element) {

        Node<E> node = head;

        while(!element.equals(node.getElement())) {

            if(node.getNext() == null) {

                return null;
            }
            else {

                node = node.getNext();
            }
        }

        return node;
    }

    public Node<E> remove(E element) {

        Node<E> removed = head;
        Node<E> previous = removed;

        while(!element.equals(removed.getElement())) {

            if(removed.getNext() == null) {

                return null;
            }
            else {

                previous = removed;
                removed = removed.getNext();
            }
        }

        if(removed == head) {

            head = head.getNext();
        }
        else {

            previous.setNext(removed.getNext());
        }

        return removed;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        Node<E> current = head;

        while(current != null) {

            sb.append(current.getElement().toString()).append(" ");
            current = current.getNext();
        }

        return sb.toString();
    }
}
