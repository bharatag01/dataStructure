package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

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
        levelOrderTraversal(root);
    }

   static void levelOrderTraversal(Node root)
   {
       Queue<Node> queue=new LinkedList<>();
       queue.add(root);

       while(!queue.isEmpty())
       {
           int size=queue.size();
           for(int i=0;i<size;i++) {
               Node x = queue.remove();
               System.out.print(x.data);
               if (x.left != null) queue.add(x.left);
               if (x.right != null) queue.add(x.right);
           }
           System.out.println("");
       }
   }
}
