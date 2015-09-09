package datastructures.ch7;

import datastructures.ch2.HighArray;
import datastructures.ch2.LowArray;

/**
 * Created with IntelliJ IDEA.
 * User: U0173910
 * Date: 9/8/15
 * Time: 9:00 PM
 */
public class ShellSort {

    private long[] array;

    public ShellSort(HighArray highArray) {
        this.array = highArray.array();
    }

    public void shellSort() {

        int h = 1;
        int inner;
        int outer;
        long temp;

        // find initial value of 'h'
        // (1, 4, 13, 40, 121, etc.)
        while (h <= (array.length / 3)) {
            h = h * 3 + 1;
        }

        while (h > 0) {
            // decreasing 'h' until h == 1
            for(outer = h; outer < array.length; outer++) {

                temp = array[outer];
                inner = outer;

                while(inner > (h - 1) && array[(inner - h)] >= temp) {

                    array[inner] = array[(inner - h)];
                    inner -= h;
                }

                array[inner] = temp;
            }

            // decrease 'h' before next pass
            h = (h - 1) / 3;
        }
    }
}
