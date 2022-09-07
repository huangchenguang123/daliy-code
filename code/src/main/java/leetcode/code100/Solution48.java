package leetcode.code100;

import java.util.Arrays;

/**
 * @date 2022/9/7 09:53
 * @author huangchenguang
 * @desc 旋转图像
 */
public class Solution48 {

    public static void main(String[] args) {
        Solution48 solution48 = new Solution48();
        int[][] result = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        solution48.rotate(result);
        System.out.println(Arrays.deepToString(result));
    }

    /**
     * @date 2022/9/7 10:16
     * @author huangchenguang
     * @desc 先按左下角-右上角对角线折叠一次，再按水平中线折叠一次
     */
    public void rotate(int[][] matrix) {
        int iLength = matrix.length;
        int jLength = matrix[0].length;
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[jLength - j - 1][iLength - i - 1];
                matrix[jLength - j - 1][iLength - i - 1] = temp;
            }
        }
        for (int i = 0; i < iLength / 2; i++) {
            for (int j = 0; j < jLength; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[iLength - i - 1][j];
                matrix[iLength - i - 1][j] = temp;
            }
        }
    }

}
