package LinkedList;

class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

class MiddleElem {
    static int getLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    static int getMiddle(Node head) {
        int length = getLength(head);
        int midIndex = length / 2;
        while (midIndex > 0) {
            head = head.next;
            midIndex--;
        }
        return head.data;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        System.out.println(getMiddle(head));
    }
}