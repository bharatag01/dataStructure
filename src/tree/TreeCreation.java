package tree;

public class TreeCreation {

    public static void main(String[] args) {

        Node root=new Node(1);
        Node first=new Node(2);
        Node second=new Node(3);

        root.left=first;
        root.right=second;

        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);

    }
}
