package com.tree;

/**
 * Created by root on 10/5/16.
 */
public class BinaryTreeMain {
    public static void main(String args[]){

        BinaryTreeOperations binaryTreeOperations = new BinaryTreeOperations();
        binaryTreeOperations.insert(12);
        binaryTreeOperations.insert(17);
        binaryTreeOperations.insert(11);
        binaryTreeOperations.insert(21);
        binaryTreeOperations.insert(27);

        System.out.println("Total number of nodes :" + binaryTreeOperations.countNodes());

        System.out.println("Height of tree :" + binaryTreeOperations.getHeight());
        System.out.println("Height of left tree :" + binaryTreeOperations.getLeftHeight());
        System.out.println("Height of right tree :" + binaryTreeOperations.getRightHeight());

    }
}
