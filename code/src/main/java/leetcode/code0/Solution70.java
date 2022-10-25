package leetcode.code0;

/**
 * @date 2022/10/25 14:43
 * @author huangchenguang
 * @desc 爬楼梯
 */
public class Solution70 {

    /**
     * @date 2022/10/25 14:46
     * @author huangchenguang
     * @desc 动态规划，爬上第n阶级有2种方式，n-1阶级走一步或者n-2阶级走两步，所以result[i] = result[i - 1] + result[i - 2]
     */
    public int climbStairs(int n) {
        int[] result = new int[n + 1];
        result[0] = 1;
        result[1] = 1;
        for (int i = 2; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }

}
