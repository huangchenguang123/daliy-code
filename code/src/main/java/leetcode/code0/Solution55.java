package leetcode.code0;

/**
 * @date 2022/11/14 17:20
 * @author huangchenguang
 * @desc 跳跃游戏
 */
public class Solution55 {

    /**
     * @date 2022/11/14 17:38
     * @author huangchenguang
     * @desc i + nums[i]为当前位置能到达的最远的值，小于这个位置的一定可以到达，当i大于max时，证明前面的位置都无法到达，返回false
     */
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max) {
                return false;
            }
            max = Math.max(max, i + nums[i]);
        }
        return true;
    }

}
