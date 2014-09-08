package datastructures.ch8;

import datastructures.specs.Searchable;
import datastructures.specs.Tree;
import datastructures.specs.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * User: Jebidia7
 * Date: 9/7/14
 * Time: 4:13 PM
 */
public class BinarySearchTree implements Tree<Integer> {

    private TreeNode root;

    @Override
    public Integer find(Searchable element) {

        TreeNode current = root;

        while(current != null &&
                current.getElement().compareTo(element) != 0) {

            if(current.getElement().compareTo(element) < 0) {
                current = current.getLeftChild();
            }
            else {
                current = current.getRightChild();
            }
        }

        return (Integer)current.getElement().get();
    }

    @Override
    public void insert(Integer element) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void delete(Integer element) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}