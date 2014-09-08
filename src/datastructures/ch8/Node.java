package datastructures.ch8;

import datastructures.specs.Element;
import datastructures.specs.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * User: Jebidia7
 * Date: 9/7/14
 * Time: 3:39 PM
 */
public class Node implements TreeNode {

    private Element<Integer> data;
    private Node leftChild;
    private Node rightChild;

    @Override
    public TreeNode getLeftChild() {

        return leftChild;
    }

    @Override
    public TreeNode getRightChild() {

        return rightChild;
    }

    @Override
    public Element getElement() {

        return data;
    }
}
