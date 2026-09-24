package LinkedList;

public class InsertionAtBegin {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }  
    }
    public void printAll(){
        Node n = head;
        while(n!=null){
            System.out.println(n.data + " ");
            n = n.next;
        }
    }
    public void push(int n3){
        Node n1 = new Node(n3);
        n1.next = head;
        head = n1;
    }
    public static void main(String[] args) {
        InsertionAtBegin ib = new InsertionAtBegin();

        ib.push(12);
        ib.push(13);
        ib.push(145);

        ib.printAll();
    }
}
