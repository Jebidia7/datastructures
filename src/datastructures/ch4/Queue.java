package datastructures.ch4;

/**
 * Created with IntelliJ IDEA.
 * User: u0173910
 * Date: 9/4/14
 * Time: 12:29 PM
 */
public class Queue {

    private int maxSize;
    private long[] data;
    private int front;
    private int rear;
    private int numberOfElements;

    public Queue(int maxSize) {

        this.maxSize = maxSize;
        data = new long[maxSize];
        front = 0;
        rear = front;
        numberOfElements = 0;
    }

    public void insert(long element) {

        if(rear == maxSize-1) {
            rear = 0;
        }

        data[rear++] = element;
        numberOfElements++;
    }

    public long remove() {

        long removed = data[front++];
        if(front == maxSize) {
            front = 0;
        }

        numberOfElements--;

        return removed;
    }

    public long front() {

        return data[front];
    }

    public boolean isEmpty() {

        return (numberOfElements == 0);
    }

    public boolean isFull() {

        return (numberOfElements == maxSize);
    }

    public int size() {

        return numberOfElements;
    }
}
