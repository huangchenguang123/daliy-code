package leetcode.offer0;

/**
 * @date 2023/2/27 16:39
 * @author huangchenguang
 * @desc 二维数组中的查找
 */
public class Offer04 {

    /**
     * @date 2023/2/27 16:54
     * @author huangchenguang
     * @desc 从右上角开始遍历，如果目标比这个数大，则往下移动一个位置，如果目标比这个数小，则往左移动一个位置
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int iLength = matrix.length;
        int jLength = matrix[0].length;
        int i = 0;
        int j = jLength - 1;
        while (i < iLength && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

}
