package datastructures;

import datastructures.ch2.HighArray;

/**
 * Created with IntelliJ IDEA.
 * User: U0173910
 * Date: 7/7/14
 * Time: 9:34 PM
 */
public class TestApp {

    public static void main(String[] args) {

        int maxSize = 100;
        HighArray highArray = new HighArray(maxSize);

        highArray.insert(77); // insert 10 items
        highArray.insert(99);
        highArray.insert(44);
        highArray.insert(55);
        highArray.insert(22);
        highArray.insert(88);
        highArray.insert(11);
        highArray.insert(00);
        highArray.insert(66);
        highArray.insert(33);

        System.out.println(highArray.toString());

        int searchElement = 35;
        if(highArray.find(searchElement)) {

            System.out.println("Found " + searchElement);
        }
        else {

            System.out.println("Can't find " + searchElement);
        }

        highArray.delete(00);
        highArray.delete(55);
        highArray.delete(99);

        System.out.println(highArray.toString());
    }
}
