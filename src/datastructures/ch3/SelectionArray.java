package datastructures.ch3;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: u0173910
 * Date: 9/3/14
 * Time: 2:57 PM
 */
public class SelectionArray {

    private long[] data;
    private int numberOfElements;

    public SelectionArray(int maxSize) {

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

        int min;
        for(int i = 0; i < numberOfElements; i++) {

            min = i;

            for(int j = i+1; j < numberOfElements; j++) {

                if(data[j] < data[min]) {
                    min = j;
                }
            }

            swap(i, min);
        }
    }

    private void swap(int one, int two) {

        long temp = data[one];
        data[one] = data[two];
        data[two] = temp;
    }
}
