package linkedList;

public class ReverseLinkedList {

    public static void main(String args[])
    {
        Node object=new Node();
        object.head =new Node(10);
        Node first=new Node(20);
        Node second=new Node(30);
        object.head.next=first;
        first.next=second;

        //10->20->30

        //10<-20<-30
        //30->20->10
        //three pointers prev curr temp

        Node prev=null;
        Node curr=object.head;//10
        while(curr!=null)
        {
            Node temp=curr.next;//null
            curr.next=prev;//20
            prev=curr;//30
            curr=temp;//null
        }
        object.head=prev;
        Node temp=object.head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
