package datastructures.ch2;

/**
 * Created with IntelliJ IDEA.
 * User: U0173910
 * Date: 7/7/14
 * Time: 9:46 PM
 */
public class OrderedArray {

    private long[] a;
    private int numberOfElements;

    public OrderedArray(int maxElements) {

        a = new long[maxElements];
        numberOfElements = 0;
    }

    public int size() {

        return numberOfElements;
    }

    public int find(long element) {

        int lower = 0;
        int upper = numberOfElements-1;
        int index = -1;

        boolean searching = true;

        while(searching) {

            index = (lower + upper) / 2;

            if(a[index] == element) {

            }
        }

        return index;
    }
}
