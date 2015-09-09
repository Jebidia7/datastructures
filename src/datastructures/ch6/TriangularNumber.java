package datastructures.ch6;

/**
 * Created with IntelliJ IDEA.
 * User: u0173910
 * Date: 7/6/15
 * Time: 2:16 PM
 */
public class TriangularNumber {

    public int triangle(int n) {

        if(n > 0) {
            return n + triangle(n - 1);
        }
        else {
            return n;
        }
    }
}
