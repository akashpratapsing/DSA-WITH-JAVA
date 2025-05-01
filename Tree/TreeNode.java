import java.io.PrintStream;
import java.util.List;

public class TreeNode {

    private Integer data;
    private TreeNode lefTreeNode;
    private TreeNode righTreeNode;

    public TreeNode() {

    }

    public TreeNode(int data) {
        this.data = data;
    }

    // Getters and Setters
    public TreeNode getLeft() {
        return this.lefTreeNode;
    }

    public TreeNode getRight() {
        return this.righTreeNode;
    }

    public int getValue() {
        return this.data;
    }

    public void setLeft(TreeNode node) {
        this.lefTreeNode = node;
    }

    public void setRight(TreeNode node) {
        this.righTreeNode = node;
    }

    // Create tree via Array Input
    public TreeNode createTree(List<Integer> arr, int i) {
        TreeNode root = null;
        // Base case for recursion
        if (i < arr.size()) {
            root = new TreeNode(arr.get(i));

            // insert left child
            root.lefTreeNode = createTree(arr, 2 * i + 1);

            // insert right child
            root.righTreeNode = createTree(arr, 2 * i + 2);
        }
        return root;
    }

    // Display Method
    public String traversePreOrder(TreeNode root) {

        if (root == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(root.getValue());

        String pointerRight = "└──";
        String pointerLeft = (root.getRight() != null) ? "├──" : "└──";

        traverseNodes(sb, "", pointerLeft, root.getLeft(), root.getRight() != null);
        traverseNodes(sb, "", pointerRight, root.getRight(), false);

        return sb.toString();
    }

    public void traverseNodes(StringBuilder sb, String padding, String pointer, TreeNode node,
            boolean hasRightSibling) {
        if (node != null) {
            sb.append("\n");
            sb.append(padding);
            sb.append(pointer);
            sb.append(node.getValue());

            StringBuilder paddingBuilder = new StringBuilder(padding);
            if (hasRightSibling) {
                paddingBuilder.append("│  ");
            } else {
                paddingBuilder.append("   ");
            }

            String paddingForBoth = paddingBuilder.toString();
            String pointerRight = "└──";
            String pointerLeft = (node.getRight() != null) ? "├──" : "└──";

            traverseNodes(sb, paddingForBoth, pointerLeft, node.getLeft(), node.getRight() != null);
            traverseNodes(sb, paddingForBoth, pointerRight, node.getRight(), false);
        }
    }

    public void print(PrintStream os, TreeNode root) {
        os.print(traversePreOrder(root));
    }

}
