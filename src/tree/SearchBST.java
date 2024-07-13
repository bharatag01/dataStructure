package tree;

public class SearchBST {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node first = new Node(-1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        root.left = first;
        root.right=second;
        second.right=third;
        third.right=fourth;

        int x=-1;
        System.out.println(search(root,x));
    }

    static boolean search(Node root,int val)
    {
        Node temp=root;
        while(temp!=null)
        {
            if(temp.data==val)
            {
                return true;
            }
            else if(temp.data>val)
            {
                temp=temp.left;
            }
            else
                temp=temp.right;
        }
        return false;
    }
}
