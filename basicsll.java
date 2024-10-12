package LinkedList;

// 1hrs 15 min  pw skill
import java.util.LinkedList;

public class basicsll {
    public static void displayr(Node head){
        // this function based on a recursive
        if(head!=null)return    ;
        System.out.println(head.next);
        display(head.next);
    }
    public static  void display (Node head){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp =temp.next;
        }
    }
    public static int length(Node head){
        // that calculated the lemgth of linked list
        int count =0;
        while(head !=null){
            count++;
            head =head.next;
        }
        return count;
    }
    public static class Node {
        int data; //store a value
        Node next; // adress of next node
        Node(int data ){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a =new Node(5);//head
        Node b =new Node(10);
        Node c =new Node(15);
        Node d =new Node(20);

        a.next=b;
        b.next=c;
        c.next=d;
// this loop also print all node  but above we create a display method
     /* Node temp=a;
      for (int i =1; i<=4 ; i++){
          System.out.println(temp.data+" ");
          temp=temp.next;
      }*/
        display(a); // that print using loop
        displayr(a); // that print recursively
    }
}
