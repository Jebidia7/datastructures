package datastructures;

import datastructures.ch2.HighArray;
import datastructures.ch3.BubbleArray;
import datastructures.ch3.InsertionArray;
import datastructures.ch3.SelectionArray;
import datastructures.ch4.PriorityQueue;
import datastructures.ch4.Reverser;
import datastructures.ch5.LinkedList;
import datastructures.ch6.TriangularNumber;
import datastructures.ch7.ShellSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        /*
        Date start = new Date();
        System.out.println("Sort started @ " + start.getTime());
        */

        //testApp.testBubbleSort();
        //testApp.testSelectionSort();
        //testApp.testInsertionSort();
        //testApp.testStackReverser();
        //testApp.testPriorityQueue();
        //testApp.testLinkedList();
        //testApp.testTriangleNumbers();
        testApp.testShellSorting();

        /*
        Date end = new Date();
        System.out.println("Sort ended @ " + end.getTime());
        System.out.println("Total time = " + (end.getTime() - start.getTime())/1000.0 + " seconds...");
        */
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

    private void testStackReverser() {

        String input, output;
        while(true) {

            System.out.print("Enter a string: ");
            System.out.flush();
            try {
                input =
                        new BufferedReader(
                                new InputStreamReader(System.in)).readLine();
                if(input.equals("")) {
                    break;
                }

                Reverser reverser = new Reverser(input);
                output = reverser.reverse();
                System.out.println("Reversed: " + output);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void testPriorityQueue() {

        PriorityQueue priorityQueue = new PriorityQueue(5);
        priorityQueue.insert(30);
        priorityQueue.insert(50);
        priorityQueue.insert(10);
        priorityQueue.insert(40);
        priorityQueue.insert(20);

        while(!priorityQueue.isEmpty()) {

            long element = priorityQueue.remove();

            System.out.println(element + " ");
        }
    }

    private void testLinkedList() {

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(40);
        list.insertFirst(80);

        System.out.println("list contents: " + list.toString());

        System.out.println("searching for 20: " + (list.find(20) == null));
        System.out.println("searching for 30: " + (list.find(20) == null));

        list.remove(20);

        System.out.println("removed 20. list contents: " + list.toString());
    }

    private void testTriangleNumbers() {

        TriangularNumber triangularNumber = new TriangularNumber();

        System.out.println(triangularNumber.triangle(10));
        System.out.println(triangularNumber.triangle(4));
    }

    private void testShellSorting() {

        int maxSize = 10000;
        HighArray array = new HighArray(maxSize);
        ShellSort shellSort = new ShellSort(array);

        for(int i = 0; i < maxSize; i++) {

            long n = (int)(Math.random() * 9999);
            array.insert(n);
        }

        System.out.println("Time: " + System.currentTimeMillis() + " - " + array.toString());
        shellSort.shellSort();
        System.out.println("Time: " + System.currentTimeMillis() + " - " + array.toString());
    }
}
