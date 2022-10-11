package leetcode.code0;

import java.util.HashMap;
import java.util.Map;

/**
 * @date 2022/10/11 14:13
 * @author huangchenguang
 * @desc 两数相加
 */
public class Solution1 {

    /**
     * @date 2022/10/11 14:17
     * @author huangchenguang
     * @desc 使用一个hash表缓存num和下标，遍历时在hash表中找到另一个数，如果没找到就把当前数加入到hash表中
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> cache = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int another = target - num;
            if (cache.containsKey(another)) {
                return new int[]{cache.get(another), i};
            } else {
                cache.put(num, i);
            }
        }
        return null;
    }

}
