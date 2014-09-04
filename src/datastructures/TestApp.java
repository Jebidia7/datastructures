package datastructures;

import datastructures.ch2.HighArray;
import datastructures.ch3.BubbleArray;
import datastructures.ch3.InsertionArray;
import datastructures.ch3.SelectionArray;

import java.util.Date;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: U0173910
 * Date: 7/7/14
 * Time: 9:34 PM
 */
public class TestApp {

    public static void main(String[] args) {

        performSort(new TestApp());
    }

    private static void performSort(TestApp testApp) {
        Date start = new Date();

        System.out.println("Sort started @ " + start.getTime());

        //testApp.testBubbleSort();
        //testApp.testSelectionSort();
        testApp.testInsertionSort();

        Date end = new Date();
        System.out.println("Sort ended @ " + end.getTime());
        System.out.println("Total time = " + (end.getTime() - start.getTime())/1000.0 + " seconds...");
    }

    private void testBubbleSort() {

        int size = 100000;

        BubbleArray bubbleArray = new BubbleArray(size);

        for(int i = 0; i < size; i++) {
            bubbleArray.insert(new Random().nextLong());
        }

        bubbleArray.sort();
    }

    private void testSelectionSort() {

        int size = 100000;

        SelectionArray selectionArray = new SelectionArray(size);

        for(int i = 0; i < size; i++) {
            selectionArray.insert(new Random().nextLong());
        }

        selectionArray.sort();
    }

    private void testInsertionSort() {

        int size = 100000;

        InsertionArray insertionArray = new InsertionArray(size);

        for(int i = 0; i < size; i++) {
            insertionArray.insert(new Random().nextLong());
        }

        insertionArray.sort();
    }
}
