package tree;

public class PrintNodes {

   static void nodesAtDistinctK(Node root, int k){
        if (root == null) return;
        if (k == 0) System.out.print(root.data + " ");
        else {
            nodesAtDistinctK(root.left, k - 1);
            nodesAtDistinctK(root.right, k - 1);
        }
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.right=new Node(70);
        root.right.right.right=new Node(80);
        int k=2;

        nodesAtDistinctK(root, k);
    }
}
