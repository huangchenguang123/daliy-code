package leetcode.code0;

import java.util.Arrays;

/**
 * @date 2022/11/7 11:13
 * @author huangchenguang
 * @desc 矩阵置零
 */
public class Solution73 {

    public static void main(String[] args) {
        Solution73 solution73 = new Solution73();
        int[][] matrix1 = new int[][]{{1, 0, 3}};
        solution73.setZeroes(matrix1);
        System.out.println(Arrays.deepToString(matrix1));
    }

    /**
     * @date 2022/11/7 11:33
     * @author huangchenguang
     * @desc 如果数组中有0，则把当前位置对应的matrix[i][0]和matrix[0][j]置为0
     * 遍历数组，如果matrix[i][0]或matrix[0][j]为0，则把当前行或列置为0
     * 需要用2个元素判断第一行和第一列是否需要置为0，因为第一行和第一列的元素会影响判断
     */
    public void setZeroes(int[][] matrix) {
        boolean x = false, y = false;
        // 先判断最上面和最左边是否需要置零
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                y = true;
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                x = true;
            }
        }
        // 遍历数组，如果为0则把最上面和最左边置零
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        // 遍历最上面和最左边，将当前行和列置0
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
        if (y) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        if (x) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }
    }

}
