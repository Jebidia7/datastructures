package datastructures.ch11;

import datastructures.specs.Element;
import datastructures.specs.HashTable;

/**
 * Created with IntelliJ IDEA.
 * User: Jebidia7
 * Date: 9/7/14
 * Time: 9:30 PM
 */
public class HashTableImpl implements HashTable<Integer, Element<String>> {

    private Element[] data;
    private int size;
    private Element deletedItem;

    public HashTableImpl(int size) {

        this.size = size;
        data = new Element[size];
    }

    @Override
    public void displayTable() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int hash(Integer key) {

        return (key % size);
    }

    @Override
    public int doubleHash(Integer key) {

        return (5 - (key % 5));
    }

    @Override
    public void insert(Integer key, Element<String> element) {

        int hash = hash(key);
        int step = doubleHash(key);

        while(data[hash] != null && !"".equals(data[hash].get())) {

            hash += step;
            hash %= size;
        }

        data[hash] = element;
    }

    @Override
    public Element<String> remove(Integer key) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Element<String> find(Integer key) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
