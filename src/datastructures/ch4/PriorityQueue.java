package datastructures.ch4;

/**
 * Created with IntelliJ IDEA.
 * User: u0173910
 * Date: 9/4/14
 * Time: 1:57 PM
 */
public class PriorityQueue {

    private int maxSize;
    private long[] data;
    private int numberOfElements;

    public PriorityQueue(int maxSize) {

        this.maxSize = maxSize;
        data = new long[maxSize];
        numberOfElements = 0;
    }

    public void insert(long element) {

        int i;

        if(numberOfElements == 0) {

            data[numberOfElements++] = element;
        }
        else {

            for(i = numberOfElements-1; i >= 0; i--) {

                if(element > data[i]) {

                    data[i+1] = data[i];
                }
                else {

                    break;
                }
            }

            data[i+1] = element;

            numberOfElements++;
        }
    }

    public long remove() {

        return data[--numberOfElements];
    }

    public long peekMin() {

        return data[numberOfElements-1];
    }

    public boolean isEmpty() {

        return (numberOfElements == 0);
    }

    public boolean isFull() {

        return (numberOfElements == maxSize);
    }
}
