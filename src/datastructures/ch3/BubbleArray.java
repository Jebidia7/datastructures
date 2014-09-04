package datastructures.ch3;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: u0173910
 * Date: 9/3/14
 * Time: 2:31 PM
 */
public class BubbleArray {

    private long[] data;
    private int numberOfElements;

    public BubbleArray(int maxSize) {

        data = new long[maxSize];
        numberOfElements = 0;
    }

    public void insert(long element) {

        data[numberOfElements++] = element;
    }

    public void display() {

        for(int i = 0; i < numberOfElements; i++) {

            System.out.println(data[i] + " ");
        }
    }

    public void sort() {

        int out, in;

        for(out = numberOfElements-1; out > 1; out--) {
            for(in = 0; in < out; in++) {

                if(data[in] > data[in+1]) {
                    swap(in, in+1);
                }
            }
        }
    }

    private void swap(int one, int two) {

        long temp = data[one];
        data[one] = data[two];
        data[two] = temp;
    }
}
