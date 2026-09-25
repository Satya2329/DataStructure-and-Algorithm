package LinkedList;
public class Travers{
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

        static void travers(Node head){
            if(head == null){
                return;
            }
            System.out.println(head.data);
            travers(head.next);
        }
        public static void main(String[] args) {
            Travers ts = new Travers();
            ts.head = new Node(10);
            ts.head.next = new Node(20);
            ts.head.next.next = new Node(30);
            travers(ts.head);
        }
    }
}