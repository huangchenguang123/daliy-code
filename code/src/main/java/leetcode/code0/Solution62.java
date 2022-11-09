package leetcode.code0;

/**
 * @date 2022/11/9 09:54
 * @author huangchenguang
 * @desc 不同路径
 */
public class Solution62 {

    /**
     * @date 2022/11/9 09:58
     * @author huangchenguang
     * @desc 机器人每次只能向下走或者向右走，那么对于每个格子来说，移动到当前格子的路径数等于移动到上面格子的路径数加上移动到左边格子的路径数
     * 对于在边缘的格子，只能从顶点往右直走或者往下直走，只有一种移动方式
     */
    public int uniquePaths(int m, int n) {
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    result[i][j] = 1;
                } else {
                    result[i][j] = result[i - 1][j] + result[i][j - 1];
                }
            }
        }
        return result[m - 1][n - 1];
    }

}
