package leetcode.code200;

import java.util.PriorityQueue;

/**
 * @date 2023/3/9 11:02
 * @author huangchenguang
 * @desc 数组中的第k个最大的元素
 */
public class Solution215 {

    /**
     * @date 2023/3/9 11:19
     * @author huangchenguang
     * @desc
     * 基于最小堆，当个数超过k后，淘汰掉最小的那个，遍历完成后，前k-1个都会被淘汰nums.length - k个都会被淘汰
     * 剩下的最小的就是第k大的元素
     */
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        for (int i : nums) {
            queue.offer(i);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        return queue.peek();
    }

}
