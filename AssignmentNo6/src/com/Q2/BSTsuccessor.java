package com.Q2;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BSTsuccessor {

    
    public static Node findMin(Node root) {
        while (root.left != null)
            root = root.left;
        return root;
    }

    
    public static Node findSuccessor(Node root, Node target) {
        if (target == null)
            return null;

        
        if (target.right != null)
            return findMin(target.right);

       
        Node successor = null;
        while (root != null) {
            if (target.data < root.data) {
                successor = root;
                root = root.left;
            } else if (target.data > root.data) {
                root = root.right;
            } else {
                break;
            }
        }
        return successor;
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(15);
        root.right.left = new Node(25);
        root.right.right = new Node(35);

        Node target = root.left; // 10

        Node successor = findSuccessor(root, target);

        if (successor != null)
            System.out.println("Successor is: " + successor.data);
        else
            System.out.println("No successor found");
    }
}