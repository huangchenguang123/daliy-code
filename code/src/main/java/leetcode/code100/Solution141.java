package leetcode.code100;

/**
 * @date 2023/4/18 11:17
 * @author huangchenguang
 * @desc 环形链表
 */
public class Solution141 {

    private static class ListNode {

        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

    }

    /**
     * @date 2023/4/18 11:18
     * @author huangchenguang
     * @desc 快慢指针，快指针每次行动2步，慢指针每次行动1步，如果相遇则认为是环状
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

}
