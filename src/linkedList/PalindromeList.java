package linkedList;

public class PalindromeList {

    public static void main(String[] args) {

        Node object=new Node();
        object.head=new Node(1);
        Node second=new Node(3);
        Node third=new Node(5);
        Node fourth=new Node(8);
        Node fifth=new Node(1);

        object.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        //reverse the second half of linked list and check one by one.
        Node slow=object.head;
        Node fast=object.head;

        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        Node head2=slow.next;
        slow.next=null;

        Node prev=null;
        Node curr=head2;
        //2->1---- 1->2
        while(curr!=null)
        {
          Node temp=curr.next;//1
          curr.next=prev;//null;
          prev=curr;
          curr=temp;
        }
        head2=prev;

        Node temp1=object.head;
        Node temp2=head2;
        boolean conditon=false;

        while(temp1!=null && temp2!=null)
        {
            if(temp1.data!=temp2.data)
            {
                conditon=true;
                System.out.print("not Palindrome");
                break;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        if(!conditon)
        System.out.print(" Palindrome");
    }
}
