package linked_list.LinkedListCycle;

/**
 * Given the head of a Singly LinkedList,
 * write a function to determine if the LinkedList has a cycle in it or not.
 */
public class Solution {

    static class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
