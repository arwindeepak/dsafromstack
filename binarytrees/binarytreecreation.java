package binarytrees;

import java.util.LinkedList;
import java.util.*;

/**
 * binarytreecreation
 */
public class binarytreecreation {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;

            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;

        }

    }

    public static void preorder(Node root) {

        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void levelorder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
           
           if (currNode==null) {
               System.out.println();
            if (q.isEmpty()) {
                break; // there is one easy way also but adding null for spacing improves logica; thinking thats why di it
            } else {   // you can do on your own without null its also easy man
                q.add(null);
            }
        } else {
            System.out.print(currNode.data + " ");
                 if (currNode.left != null) {
                q.add(currNode.left);

            }
            if (currNode.right!=null) {
                q.add(currNode.right);
            }
           }
        
        }


    }
    


    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data + " ");
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;

        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }

    public static int numberofnodes(Node root) {
        if (root == null) {
            return 0;
        }
        // int left = numberofnodes(root.left);
        // int right = numberofnodes(root.right);
        return numberofnodes(root.left) + numberofnodes(root.right) + 1;
    }

    public static int sumofnodes(Node root) {

        if (root == null) {
            return 0;
        }
   
        return  sumofnodes(root.left) + sumofnodes(root.right) + root.data;

    }

    public static int height(Node root) {
         if (root==null) {
             return 0;
         }
        
        int myHeight = Math.max( height(root.left), height(root.right)) + 1;
        return myHeight;
        
        
    }
  

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        preorder(root);
        System.out.println("space before inorder");
        inorder(root);
        System.out.println("space before postorder");
        postorder(root);
        System.out.println("level order traversal");
        levelorder(root);
        System.out.println("no of nodes in the tree are " + numberofnodes(root));
        System.out.println("sum of roots is " + sumofnodes(root));
        System.out.println("maximum height of the tree is "+ height(root));
    }
}