import java.util.Stack;

public class TreeTraversal {
    
    public static void recPreOrder(TreeNode root){

        if (root == null){
            return;
        }

        System.out.print(root.getValue() + " ");
        recPreOrder(root.getLeft());
        recPreOrder(root.getRight());
    }

    public static void recInOrder(TreeNode root){
         
        if (root == null){
            return;
        }

        recInOrder(root.getLeft());
        System.out.print(root.getValue() + " ");
        recInOrder(root.getRight());
    }

    public static void recPostOrder(TreeNode root){
        if (root == null){
            return;
        }

        recPostOrder(root.getLeft());
        recPostOrder(root.getRight());
        System.out.print(root.getValue() + " ");
    }

    public static void iterativePreOrder(TreeNode root){

        Stack<TreeNode> s = new Stack<>();
        if (root == null) {
            return;
        }

        s.push(root);
        while (!s.isEmpty()) {

            root = s.pop();
            System.out.print(root.getValue() + " ");

            if (root.getRight() != null){
                s.push(root.getRight());
            }
            if (root.getLeft() != null) {
                s.push(root.getLeft());
            }       
        }
    }

    public static void iterativeInOrder(TreeNode root){

        Stack<TreeNode> s = new Stack<>();
        if (root == null) {
            return;
        }

        while (true) {
            if (root != null){
                s.push(root);
                root = root.getLeft();          
            }else {
                if (s.isEmpty()){
                    return;
                }
                root = s.pop();
                System.out.print(root.getValue() + " ");
                root = root.getRight();
            }
        }
    }

    // Using two stacks
    public static void iterativePostOrder1(TreeNode root){

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        if (root == null) {
            return;
        }

        s1.push(root);
        while(!s1.empty()){

            root = s1.pop();
            s2.push(root);

            if (root.getLeft() != null) {
                s1.push(root.getLeft());
            }
            if (root.getRight() != null){
                s1.push(root.getRight());
            }
        }

        while (!s2.isEmpty()) {
            System.out.print(s2.pop().getValue() + " ");
        }
    }

    // Using single stack 
    public static void iterativePostOrder2(TreeNode root){
        Stack<TreeNode> s = new Stack<>();

        if (root == null) {
            return;
        }
        TreeNode curr = root;
        while (curr != null || !s.isEmpty()) {
            if (curr != null) {
                s.push(curr);
                curr = curr.getLeft();          
            }else {
                TreeNode temp = s.peek().getRight();
                if (temp == null){
                    temp = s.pop();
                    System.out.print(temp.getValue() + " ");
                    // Backtracking 
                    while (!s.isEmpty() && temp == s.peek().getRight()) {
                        temp = s.pop();
                        System.out.print(temp.getValue() + " ");
                    }
                }else {
                    curr = temp;
                }
            }
        }
    }
}
