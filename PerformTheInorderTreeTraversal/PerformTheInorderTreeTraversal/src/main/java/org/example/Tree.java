package org.example;

public class Tree {

    Node root;

    Tree() {
        root = null;
    }

    void inOrder(Node node) {
        if (node == null)
            return;


        inOrder(node.left);


        System.out.print(node.item + "->");


        inOrder(node.right);
    }
}
