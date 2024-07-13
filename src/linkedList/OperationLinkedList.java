package linkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class OperationLinkedList {
    public static void main(String[] args) {

        //create Linked List
        Node object=new Node();
        object.head =new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        object.head.next=b;
        b.next=c;

        //print elements in linked list
        Node temp=object.head;
        while(temp!=null)
        {
            System.out.print(temp.data);
            temp=temp.next;
        }

        //search elements in Linked List
        temp=object.head;
        while(temp!=null)
        {
            if(temp.data==20)
            {
                System.out.print("element found");
                break;
            }
            temp=temp.next;
        }

        //insert in linked List


    }
}