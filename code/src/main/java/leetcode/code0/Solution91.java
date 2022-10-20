package leetcode.code0;

/**
 * @date 2022/10/20 13:53
 * @author huangchenguang
 * @desc 解码方法
 */
public class Solution91 {

    /**
     * @date 2022/10/20 13:55
     * @author huangchenguang
     * @desc 动态规划
     * 1.对于当前元素s[k]来说，如果它不为0，那么就是单个字母，它的解的和等于前面k - 1个字母的解的和，f[i] += f[i - 1]
     * 2.对于当前元素s[k]来说，它可以和前面的元素组合，只需要满足条件，s[k - 1] != '0'，s[k] + s[k - 1] <= 26，它的解的和等于前面k - 2个字母的解的和，f[i] += f[i - 2]
     * 对于空字符串，有1种解，所以f[0] = 1
     * k = i - 1
     */
    public int numDecodings(String s) {
        int n = s.length();
        int[] f = new int[n + 1];
        f[0] = 1;
        for (int i = 1; i <= n; i++) {
            int k = i - 1;
            if (s.charAt(k) != '0') {
                f[i] += f[i - 1];
            }
            if (i > 1 && s.charAt(k - 1) != '0' && ((s.charAt(k - 1) - '0') * 10 + (s.charAt(k) - '0') <= 26)) {
                f[i] += f[i - 2];
            }
        }
        return f[n];
    }

}
