package datastructures.ch4;

/**
 * Created with IntelliJ IDEA.
 * User: u0173910
 * Date: 9/4/14
 * Time: 11:09 AM
 */
public class Stack {

    private int maxSize;
    private long[] data;
    private int top;

    public Stack(int maxSize) {

        this.maxSize = maxSize;
        data = new long[maxSize];
        top = -1;
    }

    public void push(long element) {

        data[++top] = element;
    }

    public long pop() {

        return data[top--];
    }

    public long peek() {

        return data[top];
    }

    public boolean isEmpty() {

        return (top < 0);
    }

    public boolean isFull() {

        return (top == maxSize-1);
    }
}
