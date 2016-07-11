package com.tree;

/**
 * Created by root on 9/5/16.
 */
public class BinaryTreeOperations {

    BinaryTreeNode root;

    //let's start with an empty binary tree
    public BinaryTreeOperations(){
        root = null;
    }

    //let's initialize our tree with a root node
    public BinaryTreeOperations(BinaryTreeNode rootNode){
        this.root = rootNode;
    }


    public void insert(int data)
    {
        root = insertNode(root, data);
    }




    private BinaryTreeNode insertNode(BinaryTreeNode node, int data){


        //To check if the root is null then create a root node with no children
        if (node == null) {

            System.out.println("inserting root node"+ data+"\n");
            node = new BinaryTreeNode(data);
        }
        else {
            if(node.getRightChild() == null){
                System.out.println("inserting right child :"+data+"\n");
                node.rightChild=insertNode(node.rightChild, data);
            }
            else if(node.getLeftChild() == null){
                System.out.println("inserting left child :"+data+"\n");
                node.leftChild = insertNode(node.leftChild, data);
            }
            else if(getRightHeight() > getLeftHeight()){
                System.out.println("inserting left child :"+data+"\n");
                node.leftChild = insertNode(node.leftChild, data);
            }
            else if (getRightHeight() < getLeftHeight()){
                System.out.println("inserting right child :"+data+"\n");
                node.rightChild=insertNode(node.rightChild, data);
            }else {
                System.out.println("inserting left child :"+data+"\n");
                node.leftChild = insertNode(node.leftChild, data);
            }
        }
        return node;
    }

    public int countNodes() {
        return countNodes(root);
    }

    private int countNodes(BinaryTreeNode r) {

        if (r == null)
            return 0;
        else
        {
            int count = 1;
            count += countNodes(r.getLeftChild());
            count += countNodes(r.getRightChild());

            return count;
        }
    }

    private int getHeight(BinaryTreeNode root) {
        if (root == null)
            return 0;

        int left = getHeight(root.getLeftChild());
        int right = getHeight(root.getRightChild());

        if (left == -1 || right == -1)
            return -1;

        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;

    }


    private int getLeftHeight(BinaryTreeNode root) {
        if (root == null)
            return 0;


        int left = getLeftHeight(root.getLeftChild());
        if (left == -1)
            return -1;

        return left + 1;

    }

    private int getRightHeight(BinaryTreeNode root) {
        if (root == null)
            return 0;


        int right = getRightHeight(root.getRightChild());

        if (right == -1)
            return -1;

        return  right + 1;

    }

    public int getHeight(){
        return getHeight(root);
    }

    public int getLeftHeight(){
        return getLeftHeight(root);
    }

    public int getRightHeight(){
        return getRightHeight(root);
    }
}



