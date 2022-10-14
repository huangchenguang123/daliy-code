package leetcode.code0;

import java.util.HashMap;
import java.util.Map;

/**
 * @date 2022/10/14 10:55
 * @author huangchenguang
 * @desc 无重复字符的最长子串
 */
public class Solution3 {

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.lengthOfLongestSubstring("abcabcbb"));
    }

    /**
     * @date 2022/10/14 10:59
     * @author huangchenguang
     * @desc 滑动窗口，记住左边界，i为右边界且一直移动，使用map来保存当前所有元素
     * 当右边界移动时
     * 如果元素不存在，则加入map，并且计算最大值
     * 如果元素存在，则移动左边界为存在元素的下一个，这里要注意left只能单向变大，不能变小（使用这个方法可以避免删除left到重复元素之间的所有元素）
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }

}
