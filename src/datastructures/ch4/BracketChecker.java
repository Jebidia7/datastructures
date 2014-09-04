package datastructures.ch4;

/**
 * Created with IntelliJ IDEA.
 * User: u0173910
 * Date: 9/4/14
 * Time: 12:20 PM
 */
public class BracketChecker {

    private String input;

    public BracketChecker(String input) {

        this.input = input;
    }

    public void check() {

        int stackSize = input.length();
        Stack stack = new Stack(stackSize);

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            switch (c) {
                case '{':
            }
        }
    }
}
