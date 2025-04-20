import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class TreeTraversal {
    

    public static void inOrderTraversal(Node root){

        if (root != null){

            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void preOrderTraversal(Node root){

        if (root != null){

            System.out.print(root.data + " ");
            inOrderTraversal(root.left);
            inOrderTraversal(root.right);
        }
    }

    public static void postOrderTraversal(Node root){

        if (root != null){

            inOrderTraversal(root.left);
            inOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static int getHeight(Node root){

        if (root == null) {
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    
    public static void levelOrder(Node root){

        if (root == null) {
            return;
        }

        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node node = q.poll();
            System.out.print(node.data + " ");

            if (node.left != null) {
                q.add(node.left);
            }
            if (node.right != null) {
                q.add(node.right);
            }
        }
    } 
   

    //  public ArrayList<ArrayList<Integer>> levelOrder(Node root) {

    //     if () {
            
    //     }
    // }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.left.left = new Node(5);
        root.right.left.right = new Node(6);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        // Perform level order traversal
        // ArrayList<ArrayList<Integer>> res = levelOrder(root);

        // // Print the result
        // for (ArrayList<Integer> level : res) {
        //     for (int data : level) {
        //         System.out.print(data + " ");
        //     }
        // }

       // levelOrder(root);
       System.out.println("In-Order Traversal ");
       inOrderTraversal(root);
       System.out.println("\nPre-Order Traversal ");
       preOrderTraversal(root);
       System.out.println("\nPre-Order Traversal ");
       postOrderTraversal(root);
       System.out.println("\n" + getHeight(root));

       System.out.println("Level Order");
       levelOrder(root);
      
        
    }
}
