package tree;

import java.util.HashMap;

public class ConstructBinaryFromInorderPostOrder {
    //A = [2, 1, 3]
    // B = [2, 3, 1]
    //A = [6, 1, 3, 2]
    //B = [6, 3, 2, 1]
    public static void main(String[] args) {

        int inOrder[] = {6, 1, 3, 2};
        int postOrder[] = {6, 3, 2, 1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inOrder.length; i++) {
            map.put(inOrder[i], i);
        }
        Node root = treeFromInorderPostOrder(inOrder, postOrder, 0, inOrder.length - 1, 0, postOrder.length - 1, map);
        print(root);

    }

    static Node treeFromInorderPostOrder(int inOrder[], int postOrder[], int isi, int iei, int psi, int pei, HashMap<Integer, Integer> map) {
        if (isi > iei) return null;
        int data = postOrder[pei];
        Node root = new Node(data);
        int index = map.get(data);
        int countl = index - isi;
        root.left = treeFromInorderPostOrder(inOrder, postOrder, isi, index - 1, psi, psi + countl - 1, map);
        root.right = treeFromInorderPostOrder(inOrder, postOrder, index + 1, iei, psi + countl, pei - 1, map);
        return root;
    }

    static void print(Node root) {
        if (root == null) return;
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }
}
