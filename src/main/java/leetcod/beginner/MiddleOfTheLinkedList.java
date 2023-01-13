package leetcod.beginner;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        int middle = length % 2 == 1 ? length / 2 + 1 : length / 2;

        current = head;
        for (int i = 0; i < middle; i++) {
            current = current.next;
        }

        return current;
    }

    public ListNode middleNode2(ListNode head) {
        ListNode middle = head;
        ListNode end = head;

        while (end != null && end.next != null) {
            middle = middle.next;
            end = end.next.next;
        }
        return middle;
        // Time Complexity = O(n)
        // Space Complexity = O(1)
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}