package leetcode.code0;

/**
 * @date 2022/11/28 13:56
 * @author huangchenguang
 * @desc 最大子数组和
 */
public class Solution53 {

    public static void main(String[] args) {
        Solution53 solution53 = new Solution53();
        System.out.println(solution53.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    /**
     * @date 2022/11/28 14:13
     * @author huangchenguang
     * @desc 遍历，用一个temp存储临时的值，当temp小于0时，需要重置为0，遍历时获取max和temp的最大值
     */
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int temp = 0;
        for (int num : nums) {
            temp += num;
            max = Math.max(temp, max);
            if (temp < 0) {
                temp = 0;
            }
        }
        return max;
    }

}
