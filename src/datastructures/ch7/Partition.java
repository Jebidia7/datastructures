package datastructures.ch7;

import datastructures.ch2.HighArray;

/**
 * Created with IntelliJ IDEA.
 * User: U0173910
 * Date: 9/8/15
 * Time: 9:37 PM
 */
public class Partition {

    private long[] array;
    private int leftIndex, rightIndex;
    private int pivot;

    public Partition(HighArray highArray) {
        this.array = highArray.array();

        leftIndex = -1;
        rightIndex = highArray.size();

        pivot = (int)highArray.getMaxElement();
    }

    public void partition() {

        while(leftIndex < rightIndex) {

            while(array[++leftIndex] < pivot);

            while(array[--rightIndex] > pivot);

            swap();
        }
    }

    private void swap() {

        long temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }
}
