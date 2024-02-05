package org.example;

public class Main {

    Node root;

    Main() {
        root = null;
    }


    public static int countLeaf(Node node) {
        if (node == null) {
            return 0;
        }


        if (node.left == null && node.right == null) {
            return 1;
        } else {
            return countLeaf(node.left) + countLeaf(node.right);
        }
    }
}