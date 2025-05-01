import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8);
        TreeNode root = new TreeNode();
        root = root.createTree(arr, 0);

        root.print(System.out, root);


        System.out.println("\n<====================Recursive Tree Traversal=========================>");
        System.out.println("-----------------------Pre-Order Traversal------------------------------");
        TreeTraversal.recPreOrder(root);

        System.out.println("\n-----------------------In-Order Traversal------------------------------");
        TreeTraversal.recInOrder(root);

        System.out.println("\n-----------------------Post-Order Traversal------------------------------");
        TreeTraversal.recPostOrder(root);

        System.out.println("\n<====================Iterative Tree Traversal=========================>");
        System.out.println("-----------------------Pre-Order Traversal------------------------------");
        TreeTraversal.iterativePreOrder(root);

        System.out.println("\n-----------------------In-Order Traversal------------------------------");
        TreeTraversal.iterativeInOrder(root);
        System.out.println("\n-----------------------Post-Order Traversal------------------------------");
        TreeTraversal.iterativePostOrder1(root);
        System.out.println("\n-----------------------Post-Order Traversal------------------------------");
        TreeTraversal.iterativePostOrder2(root);

    }
}
