package linked_list.LinkedListCycleLength;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Tests {
    private Solution solution;

    @BeforeEach
    public void setUp() {
        this.solution = new Solution();
    }

    @Test
    public void testLinkedListCycleLength() {
        Solution.ListNode head = new Solution.ListNode(1);
        head.next = new Solution.ListNode(2);
        head.next.next = new Solution.ListNode(3);
        head.next.next.next = new Solution.ListNode(4);
        head.next.next.next.next = new Solution.ListNode(5);
        head.next.next.next.next.next = new Solution.ListNode(6);
        head.next.next.next.next.next.next = head.next.next;

        Assertions.assertEquals(4, solution.findCycleLength(head));

        head.next.next.next.next.next.next = head.next.next.next;

        Assertions.assertEquals(3, solution.findCycleLength(head));
    }
}
