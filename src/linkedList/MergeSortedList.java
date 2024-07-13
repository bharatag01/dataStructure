package linkedList;

public class MergeSortedList {
    public static void main(String[] args) {
        Node n=new Node();
        n.head=new Node(10);
        Node first=new Node(20);
        Node second=new Node(30);

        n.head.next=first;
        first.next=second;

        Node n1=new Node();
        n1.head=new Node(5);
        Node first1=new Node(15);
        Node second1=new Node(25);

        n1.head.next=first1;
        first1.next=second1;

        Node t1=n.head;
        Node t2=n1.head;

        Node finalhead=null;Node tail=null;

        if(t1!=null && t2!=null && t1.data>t2.data)
        {
            finalhead=t2;
            tail=t2;
            t2=t2.next;
        }
        else if(t1!=null && t2!=null && t1.data<t2.data)
        {
            finalhead=t1;
            tail=t1;
            t1=t1.next;
        }

        while(t1!=null && t2!=null)
        {
            if(t1.data>=t2.data)
            {
                tail.next=t2;
                tail=t2;
                t2=t2.next;
            }
            else
            {
                tail.next=t1;
                tail=t1;
                t1=t1.next;
            }
        }

        if(t2==null)
        {
            tail.next=t1;
        }

        if(t1==null)
        {
            tail.next=t2;
        }

        Node temp=finalhead;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }

    }

}
