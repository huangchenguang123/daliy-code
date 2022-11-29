package leetcode.code0;

/**
 * @date 2022/11/29 10:23
 * @author huangchenguang
 * @desc Pow(x, n)
 */
public class Solution50 {

    public static void main(String[] args) {
        Solution50 solution50 = new Solution50();
        System.out.println(solution50.myPow(2.0, 10));
    }

    /**
     * @date 2022/11/29 10:48
     * @author huangchenguang
     * @desc 快速幂，对一个数的幂次方来说，如果是偶数的话，可以分解成pow(x^2, n/2)，对于基数，可以分解成x * pow(x^2, n - 1)
     */
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        long nn = n;
        boolean needChange = nn < 0;
        nn = needChange ? -nn : nn;
        double a = x, b = 1.0;
        while (nn > 1) {
            if (nn % 2 == 0) {
                a *= a;
                nn /= 2;
            } else {
                b *= a;
                nn--;
            }
        }
        return needChange ? 1 / (a * b) : (a * b);
    }

}
