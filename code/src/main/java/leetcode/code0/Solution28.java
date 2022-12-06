package leetcode.code0;

/**
 * @date 2022/12/6 16:23
 * @author huangchenguang
 * @desc 找出字符串中第一个匹配项的下表
 */
public class Solution28 {

    /**
     * @date 2022/12/6 16:45
     * @author huangchenguang
     * @desc 1.朴素算法，依次匹配 2.KMP
     */
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            char c1 = haystack.charAt(i);
            char c2 = needle.charAt(0);
            if (c1 == c2) {
                char first = c1;
                for (int j = 0; j < needle.length(); j++) {
                    if (i + j >= haystack.length()) {
                        break;
                    }
                    c1 = haystack.charAt(i + j);
                    c2 = needle.charAt(j);
                    if (c1 != c2) {
                        break;
                    }
                    if (j == needle.length() - 1) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

}
