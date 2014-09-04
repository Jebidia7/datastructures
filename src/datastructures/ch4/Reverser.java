package datastructures.ch4;

/**
 * Created with IntelliJ IDEA.
 * User: u0173910
 * Date: 9/4/14
 * Time: 11:17 AM
 */
public class Reverser {
    private String input;
    private String output;

    public Reverser(String input) {

        this.input = input;
    }

    public String reverse() {

        int stackSize = input.length();
        Stack stack = new Stack(stackSize);

        for(int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);
            stack.push(c);
        }

        output = "";

        while(!stack.isEmpty()) {

            char c = (char)stack.pop();
            output = output + c;
        }

        return output;
    }
}
