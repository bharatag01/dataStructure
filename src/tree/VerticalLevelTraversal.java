package tree;

import java.util.*;

public class VerticalLevelTraversal {
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

        verticalTraversal(root);

    }

    private static void verticalTraversal(Node root) {

        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(root,0));
        HashMap<Integer, List<Integer>> map=new HashMap<>();
        int minVal=0,maxVal=0;
        while(!queue.isEmpty())
        {
            Pair pair=queue.remove();
            minVal=Math.min(minVal,pair.level);
            maxVal=Math.max(maxVal, pair.level);
            List<Integer> list;
            if(map.containsKey(pair.level)) {
                list = map.get(pair.level);
            }
            else {
                list = new ArrayList<>();
            }
            list.add(pair.node.data);
            map.put(pair.level,list);
            if(pair.node.left!=null)
                queue.add(new Pair(pair.node.left,pair.level-1));
            if(pair.node.right!=null)
                queue.add(new Pair(pair.node.right,pair.level+1));

        }

        for(int i=minVal;i<=maxVal;i++)
        {
            System.out.println(map.get(i));
        }

    }
}
