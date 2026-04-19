package com.Q1;
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class BSTOperations {

    
    public static int findLevel(Node root, int key) {
        int level = 0;

        while (root != null) {
            if (root.data == key)
                return level;

            else if (key < root.data) {
                root = root.left;
            } else {
                root = root.right;
            }

            level++;
        }

        return -1; 
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(3);
        root.left.right = new Node(7);

        System.out.println("Level of 7: " + findLevel(root, 7));
    }
}
