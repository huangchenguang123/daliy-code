package leetcode.code0;

/**
 * @date 2022/10/12 16:43
 * @author huangchenguang
 * @desc 两数相加
 */
public class Solution2 {

    private static class ListNode {

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
     * @date 2022/10/12 16:44
     * @author huangchenguang
     * @desc 链表遍历，将2个value相加，需要注意进位以及最后以为多余的进位
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode current = null;
        int temp = 0;
        while (l1 != null || l2 != null) {
            int value1 = l1 == null ? 0 : l1.val;
            int value2 = l2 == null ? 0 : l2.val;
            int value = value1 + value2 + temp;
            temp = value / 10;
            value %= 10;
            if (current == null) {
                current = new ListNode(value);
                head = current;
            } else {
                current.next = new ListNode(value);
                current = current.next;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (temp != 0) {
            current.next = new ListNode(temp);
        }
        return head;
    }

}
