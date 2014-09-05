package datastructures.specs.impl;

import datastructures.specs.Element;
import datastructures.specs.Searchable;

/**
 * Created with IntelliJ IDEA.
 * User: Jebidia7
 * Date: 9/5/14
 * Time: 11:05 AM
 */
public class IntElement implements Element<Integer> {

    private Integer value;

    public IntElement(int value) {

        this.value = value;
    }

    @Override
    public int compareTo(Element<Integer> o) {

        long me = getSearchKey();
        long other = o.getSearchKey();

        if(me == other) {
            return 0;
        }
        else if(me > other) {
            return 1;
        }
        else {
            return -1;
        }
    }

    @Override
    public Integer get() {

        return value;
    }

    @Override
    public long getSearchKey() {

        return value;
    }
}
