package BST;

import java.util.ArrayList;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean Search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return Search(root.left, key);
        } else if (root.data < key) {
            return Search(root.right, key);
        }
        return false;
    }

    // public static Node delete(Node root, int val) {
    //     if (root.data>val) {
    //         root.left = delete(root.left, val);
    //     } else if (root.data < val) {
    //         root.right = delete(root.right, val);
    //     }
    //     else {
    //         //case 1 root.data==val
    //         if (root.left == null && root.right == null) {
    //             return null;
    //         }
    //         //case 2
    //         if (root.left == null) {
    //             return root.right;

    //         }
    //         if (root.right == null) {
    //             return root.left;
    //         }
    //         //case 3
    //         root.data = minValue(root.right);
    //         root.right = delete(root.right, root.data);

    //     }
    //     return root;
    // }

    // public static int minValue(Node root) {
    //     int minv = root.data;
    //     while (root.left != null) {
    //         minv = root.left.data;
    //         root = root.left;
    //     }
    //     return minv;
    // }
    public static Node delete(Node root, int value) {
        //first search in the binary search tree than write the value
        if (root.data > value) {
            root.left = delete(root.left, value);
        } else if (root.data < value) {
            root.right = delete(root.right, value);
        } else {
            //case 1
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    public static int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    public static void printInRange(Node root, int x, int y) {
        if (root == null) {
            return;
        }
        if (root.data >= x && root.data <= y) {
            printInRange(root.left, x, y);
            System.out.println(root.data + " ");
            printInRange(root.right, x, y);
        } else if (root.data <= y) {
            printInRange(root.right, x, y);
        } else {
            printInRange(root.left, x, y);
        }
    }
 public static void printPath(ArrayList<Integer> path){
     for (int i = 0; i < path.size(); i++) {
         System.out.print(path.get(i)+ "---->");
     }
       System.out.println();
    }

public static void printroot2leaf(Node root, ArrayList<Integer> path) {
   
    if (root == null) {
        return;
    }
     path.add(root.data);
    if (root.left==null && root.right==null) {
        printPath(path);
    }
    else {
        printroot2leaf(root.left, path);
        printroot2leaf(root.right, path);
    }
    path.remove(path.size() - 1);
   


   
    
}
    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 6,10,11,14  };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        // delete(root, 5);
        System.out.println("___________________________________");
        inorder(root);
        System.out.println("_______________________________________________");
        printInRange(root, 6, 10);
        printroot2leaf(root, new ArrayList<>());

        // if (Search(root, 4)) {
        //     System.out.println("found the value");
        // } else {
        //     System.out.println("not found");
        // }

    }
}
