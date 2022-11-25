package leetcode.code0;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2022/11/25 14:36
 * @author huangchenguang
 * @desc 螺旋矩阵
 */
public class Solution54 {

    /**
     * @date 2022/11/25 14:53
     * @author huangchenguang
     * @desc 模拟，先定下上下左右四个边界，然后按右，下，左，上遍历，每次走完一条边就缩减边界大小
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int u = 0, d = matrix.length - 1, l = 0, r = matrix[0].length - 1;
        while (true) {
            for (int i = l; i <= r; i++) {
                list.add(matrix[u][i]);
            }
            u++;
            if (u > d) {
                break;
            }
            for (int i = u; i <= d; i++) {
                list.add(matrix[i][r]);
            }
            r--;
            if (l > r) {
                break;
            }
            for (int i = r; i >= l; i--) {
                list.add(matrix[d][i]);
            }
            d--;
            if (u > d) {
                break;
            }
            for (int i = d; i >= u; i--) {
                list.add(matrix[i][l]);
            }
            l++;
            if (l > r) {
                break;
            }
        }
        return list;
    }

}
