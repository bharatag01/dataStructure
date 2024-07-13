package linkedList;

public class MiddleElement {
    public static void main(String[] args) {

        Node object=new Node();
        object.head=new Node(1);//1->2->3->4
        Node first=new Node(2);
        Node second=new Node (3);
        Node third=new Node (4);

        object.head.next=first;
        first.next=second;
        second.next=third;

        Node slow=object.head,fast=object.head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        System.out.println(slow.data);
    }

}
