package leetcode.code0;

/**
 * @date 2022/10/26 14:19
 * @author huangchenguang
 * @desc x的平方根
 */
public class Solution69 {

    public static void main(String[] args) {
        System.out.println(new Solution69().mySqrt(2147395599));
    }

    /**
     * @date 2022/10/26 14:19
     * @author huangchenguang
     * @desc 二分查找法，如果mid * mid > x，那么肯定不是解，如果mid * mid <= x，那么有可能是解，先记录下来，然后继续二分查找
     */
    public int mySqrt(int x) {
        int l = 0, r = x, result = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (((long) mid * mid) > x) {
                r = mid - 1;
            } else {
                result = mid;
                l = mid + 1;
            }
        }
        return result;
    }

}
