package org.example;

import static org.example.Main.countLeaf;

public class ObjectOfTree {

    public static void main(String[] args) {


        Main tree = new Main();


        tree.root = new Node(5);
        tree.root.left = new Node(3);
        tree.root.right = new Node(8);


        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(4);


        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(9);


        int leafNodes = countLeaf(tree.root);
        System.out.println("Total Leaf Nodes = " + leafNodes);
    }
}
