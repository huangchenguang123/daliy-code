package leetcode.offer0;

import java.util.HashSet;
import java.util.Set;

/**
 * @date 2023/2/27 14:51
 * @author huangchenguang
 * @desc 数组中重复的数字
 */
public class Offer03 {

    /**
     * @date 2023/2/27 16:32
     * @author huangchenguang
     * @desc 使用set来判断是否已经遍历过该数字，没有遍历过则加入到set中
     */
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            }
            set.add(nums[i]);
        }
        return -1;
    }

}
