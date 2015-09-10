package datastructures.ch2;

/**
 * Created with IntelliJ IDEA.
 * User: U0173910
 * Date: 7/7/14
 * Time: 9:27 PM
 */
public class HighArray {

    private long[] a;
    private int numberOfElements;
    private long maxElement;

    public HighArray(int maxSize) {

        a = new long[maxSize];
        numberOfElements = 0;
        maxElement = 0;
    }

    public boolean find(long element) {

        for(int i = 0; i < numberOfElements; i++) {

            if(a[i] == element) {

                return true;
            }
        }

        return false;
    }

    public void insert(long element) {

        a[numberOfElements++] = element;

        if(element > maxElement) {
            maxElement = element;
        }
    }

    public boolean delete(long element) {

        boolean found = false;

        for(int i = 0; i < numberOfElements; i++) {

            if(a[i] == element) {
                found = true;
            }

            if(found) {
                a[i] = a[i+1];
            }
        }

        if(found) {
            numberOfElements--;
        }

        return found;
    }

    public int size() {

        return numberOfElements;
    }

    public long getMaxElement() {
        return maxElement;
    }

    public long[] array() {

        return a;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < numberOfElements; i++) {
            sb.append(a[i] + " ");
        }

        return sb.toString();
    }
}
