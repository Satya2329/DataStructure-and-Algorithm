package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class DeleteAtEnd {

    public ListNode deleteAtEnd(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }

        curr.next = null;
        return head;
    }

    public static void main(String[] args) {
    
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

        DeleteAtEnd solution = new DeleteAtEnd();
        head = solution.deleteAtEnd(head);

        // Print result: 1 -> 2 -> 3
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + (curr.next != null ? " -> " : ""));
            curr = curr.next;
        }
    }
}
