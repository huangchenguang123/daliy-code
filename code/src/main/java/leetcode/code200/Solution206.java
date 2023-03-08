package leetcode.code200;

/**
 * @date 2023/3/8 11:39
 * @author huangchenguang
 * @desc 反转链表
 */
public class Solution206 {

    public static class ListNode {

        int val;

        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    /**
     * @date 2023/3/8 15:04
     * @author huangchenguang
     * @desc 链表反转
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

}
