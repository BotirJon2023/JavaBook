package org.example;

public class PerformTheInorderTreeTraversal {

    public static void main(String[] args) {


        Tree tree = new Tree();


        tree.root = new Node(1);
        tree.root.left = new Node(12);
        tree.root.right = new Node(9);


        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);

        System.out.println("In Order traversal");
        tree.inOrder(tree.root);
    }
}
