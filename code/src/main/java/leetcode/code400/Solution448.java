package leetcode.code400;

import java.util.LinkedList;
import java.util.List;

/**
 * @date 2022/9/30 11:08
 * @author huangchenguang
 * @desc 找到所有数组中消失的数字
 */
public class Solution448 {

    /**
     * @date 2022/9/30 11:33
     * @author huangchenguang
     * @desc 由于数组中的元素是1 - n，如果这个num存在，就在数组num - 1这个位置加上n，最后遍历数组，当元素小于等于n时，就代表这个i位置的元素不存在
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int temp = nums.length;
        for (int i = 0; i < nums.length; i++) {
            nums[(nums[i] - 1) % temp] += temp;
        }
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= temp) {
                result.add(i + 1);
            }
        }
        return result;
    }

}
