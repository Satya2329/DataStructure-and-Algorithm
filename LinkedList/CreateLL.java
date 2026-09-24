package LinkedList;

public class CreateLL{
     Node head;

     static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

     }
 public void printAll(){
    Node n = head;
    while (n!= null) {
        System.out.println(n.data + " ");
        n = n.next;
    }
 }
 public static void main(String[] args) {
    CreateLL ll = new CreateLL();

    ll.head = new Node(1);
    ll.head.next = new Node(2);
    ll.printAll();



 }
 
}