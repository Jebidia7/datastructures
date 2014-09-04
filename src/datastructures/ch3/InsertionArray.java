package datastructures.ch3;

/**
 * Created with IntelliJ IDEA.
 * User: u0173910
 * Date: 9/3/14
 * Time: 3:14 PM
 */
public class InsertionArray {

    private long[] data;
    private int numberOfElements;

    public InsertionArray(int maxSize) {

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

        for(int dividingLine = 1; dividingLine < numberOfElements; dividingLine++) {

            long temp = data[dividingLine];
            int element = dividingLine;

            while(element > 0 && data[element-1] >= temp) {

                data[element] = data[element-1];
                element--;
            }

            data[element] = temp;
        }
    }
}
