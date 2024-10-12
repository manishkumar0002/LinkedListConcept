package LinkedList;

public class reverseLinkedList {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static Node reverse(Node head){

        if (head.next==null) return head;

        Node newHead =reverse(head.next);
        head.next.next=head; // interchanging the connection
        return newHead;


    }
    public static void display(Node head){
        if (head==null ) return;;
        displayrev(head.next);
        System.out.print(head.val+" ");
    }
    public static void displayrev(Node head){

        if (head==null) return;
        System.out.print(head.val+" "); // agar issii sout revsre display method ke call ke baad likhu to list ke
        //element reverse print ho jayega lkn node revse nahi hoga


        display(head.next);
    }
    public static void main(String[] args) {

        Node a =new Node(3);
        Node b =new Node(5);
        Node c =new Node(1);
        Node d =new Node(2);
        Node e =new Node(4);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        //display(a);
          Node r =reverse(a);
    }
}
