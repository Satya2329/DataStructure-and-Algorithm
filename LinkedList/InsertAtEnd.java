package LinkedList;

public class InsertAtEnd {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }   
    }

    public void append(int n) {
        Node n1 = new Node(n);

  
        if (head == null) {
            head = n1;
            return; 
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = n1;
    }

    static void Travers(Node head) {
        if (head == null) {
            return;
        } 
        System.out.println(head.data);
        Travers(head.next);
    }

    public static void main(String[] args) {
        InsertAtEnd ie = new InsertAtEnd();
        ie.head = new Node(10);
        ie.head.next = new Node(20);
        ie.head.next.next = new Node(30);

        ie.append(38);
        Travers(ie.head);
    }
}