package linked_list.LinkedListCycleLength;

/**
 * Given the head of a LinkedList with a cycle, find the length of the cycle
 */
public class Solution {
    static class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
        }
    }

    public int findCycleLength(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return calculateLength(slow);
            }
        }

        return 0;
    }

    private int calculateLength(ListNode slow) {
        ListNode curr = slow;
        int length = 0;

        do {
            curr = curr.next;
            length++;
        } while (curr != slow);

        return length;
    }
}
