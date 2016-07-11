package com.tree;

/**
 * Created by root on 9/5/16.
 */
public class BinaryTreeNode {

    public BinaryTreeNode leftChild;
    public BinaryTreeNode rightChild;
    public int data;


    //this will create a leaf node
    BinaryTreeNode(int data){
        leftChild = null;
        rightChild = null;
        this.data = data;

    }

    public void setLeftChild(BinaryTreeNode node){

        leftChild = node;
    }

    public BinaryTreeNode getLeftChild(){

        return leftChild;
    }

    public void setRightChild(BinaryTreeNode node){

        rightChild = node;
    }

    public BinaryTreeNode getRightChild(){
        return rightChild;
    }

    public void setData(int value){

        data = value;
    }

    public int getData(){
        return data;
    }
}
