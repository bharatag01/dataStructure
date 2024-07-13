package tree;

public class BalancedTree {
    static boolean isBalanaced = true;
    public static void main(String[] args) {

        Node root=new Node(1);
        Node first=new Node(2);
        Node second=new Node(3);
        Node third=new Node(4);
        Node fourth=new Node(5);

        root.left=first;
        root.right=second;
        first.left=third;
        third.left=fourth;

        findBalancedTree(root);
        System.out.println("tree is balanced"+isBalanaced);
    }

    static int findBalancedTree(Node root) {
        if (root == null) return -1;
        int leftHeight = findBalancedTree(root.left);
        int rightHeight = findBalancedTree(root.right);
        if (Math.abs(leftHeight - rightHeight) > 1)
            isBalanaced = false;
        return Math.max(leftHeight, rightHeight) + 1;
    }
}