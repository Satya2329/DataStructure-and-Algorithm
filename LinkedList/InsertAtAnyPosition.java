package LinkedList;
public class InsertAtAnyPosition {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    public void insertAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Position cannot be negative.");
            return;
        }

        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Position out of bounds.");
                return;
            }
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertAtAnyPosition list = new InsertAtAnyPosition();

        list.insertAtPosition(10, 0); 
        list.insertAtPosition(30, 1); 
        list.insertAtPosition(20, 1);
        list.insertAtPosition(40, 3);
        list.insertAtPosition(5, 0);
        System.out.print("Final Linked List: ");
        list.printList();
    }
}

