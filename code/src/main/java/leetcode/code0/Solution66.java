package leetcode.code0;

/**
 * @date 2022/10/27 11:19
 * @author huangchenguang
 * @desc 加一
 */
public class Solution66 {

    /**
     * @date 2022/10/27 11:34
     * @author huangchenguang
     * @desc 模拟
     */
    public int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        int temp = 1;
        for (int i = n; i >= 0; i--) {
            digits[i] += temp;
            temp = digits[i] / 10;
            digits[i] %= 10;
        }
        if (temp != 0) {
            int[] nn = new int[digits.length + 1];
            System.arraycopy(digits, 0, nn, 1, n);
            digits = nn;
            digits[0] = temp;
        }
        return digits;
    }

}
