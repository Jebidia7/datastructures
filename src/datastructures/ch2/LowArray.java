package datastructures.ch2;

/**
 * Created with IntelliJ IDEA.
 * User: U0173910
 * Date: 7/7/14
 * Time: 9:23 PM
 */
public class LowArray {

    private long[] a;

    public LowArray(int size) {

        a = new long[size];
    }

    public void setElement(int index, long value) {

        a[index] = value;
    }

    public long getElement(int index) {

        return a[index];
    }
}
