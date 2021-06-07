package linked_list.LinkedListCycle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Tests {
    Solution solution;

    @BeforeEach
    public void setUp() {
        this.solution = new Solution();
    }

    @Test
    public void testLinkedListCycle() {
        Solution.ListNode head = new Solution.ListNode(1);
        head.next = new Solution.ListNode(2);
        head.next.next = new Solution.ListNode(3);
        head.next.next.next = new Solution.ListNode(4);
        head.next.next.next.next = new Solution.ListNode(5);
        head.next.next.next.next.next = new Solution.ListNode(6);

        Assertions.assertFalse(solution.hasCycle(head));

        head.next.next.next.next.next.next = head.next.next;
        Assertions.assertTrue(solution.hasCycle(head));
    }
}
