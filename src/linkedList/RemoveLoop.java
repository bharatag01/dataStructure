package linkedList;

public class RemoveLoop {
    public static void main(String[] args) {

        Node object=new Node();
        object.head =new Node(10);
        Node b=new Node(20);

        object.head.next=b;
        b.next=object.head;

    }
}
