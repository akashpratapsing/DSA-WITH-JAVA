package tree;

public class BinaryTree {
    Node root;

    int maxDepth(Node root){
        if(root == null){
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }


    public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Height of tree is "
						+ tree.maxDepth(tree.root));
	}
}
