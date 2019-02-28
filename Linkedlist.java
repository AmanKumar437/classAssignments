

import java.io.*;

public class Linkedlist {
 Node head;
 public class Node{
     int data;
     Node next;
 }
 public void insert(int data)
 {
     Node node=new Node();
     node.data=data;
     node.next=null;
     if(head==null)
     {
         head=node;
     }
     else{
         Node n=head;
         while(n.next!=null)
         {
             n=n.next;
         }
         n.next=node;
     }
 }
 public void show()
 {
     Node node=head;
     while(node.next!=null)
     {
         
         System.out.println(node.data);
         node=node.next;
     }
     System.out.println(node.data);
 }
 public static void main(String args[])
 {
     Linkedlist list=new Linkedlist();
     list.insert(5);
     list.insert(6);
     list.insert(7);
     list.show();
 }
}