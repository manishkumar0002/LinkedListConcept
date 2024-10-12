package LinkedList;

import java.util.LinkedList;

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data ){
            this.data=data;
        }
    }

    public static class linkedlist{
        Node head=null;
        Node tail=null;
        void insertAtEnd(int val){
            Node temp=new Node(val);
             if (head==null){
                 head=temp;
             }
             else {
                 tail.next=temp;
             }
            tail=temp;
        }
        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head ==null){
                //empty list
               // head =tail=temp;
// or
                insertAtEnd(val);
            }
            else {
                //non empty set
                temp.next=head;
                head=temp;
            }
        }
        // insert ,method
        // implemnt a methos o=to insert a node at any given index

        void insertAt(int idx, int val ){
            Node t =new Node(val);
            Node temp =head;
            if (idx==size()){
                insertAtEnd(val);
                return;
            }else if (idx==0){
                insertAtHead(val);
                return;
            } else if (idx < 0 ||idx >size() ) {
                System.out.println("wrong index ");
                return;
                
            }
            for (int i =1; i<= idx-1; i++){
                temp= temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        public void display() {
            Node t=head;
            while(t!=null){
                System.out.print(t.data+" ");
                t=t.next;
            }
            System.out.println();
        }

        public int size() {
            int count=0;
            Node t=head;
            while(t!=null){
               count++;
                t=t.next;
            }
            return count;
        }

        public int getAt(int idx) {
            Node temp =head;
            for (int i =1; i<= idx; i++){
                temp=temp.next;
            }
            return temp.data;
        }
    }
    public static void main(String[] args)  {
        linkedlist ll =new linkedlist();
        /*ll.insertAtHead(4);*/
        ll.insertAtEnd(4); // 4
        //ll.display();
        ll.insertAtEnd(5);// 4-> 5
        ll.insertAtEnd(12);
        ll.insertAtHead(13);// 13-> 4-> 5->12
        ll.display();
        ll.insertAt(4,10);
        ll.display();
        ll.insertAt(1,100);
        ll.size();

        System.out.println(ll.getAt(3));
    }
}
