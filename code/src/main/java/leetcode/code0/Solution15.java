package leetcode.code0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @date 2022/9/5 15:29
 * @author huangchenguang
 * @desc 三数之和
 */
public class Solution15 {

    public static void main(String[] args) {
        Solution15 solution15 = new Solution15();
        System.out.println(solution15.threeSum(new int[]{0, 0, 0}));
    }

    /**
     * @date 2022/9/5 18:33
     * @author huangchenguang
     * @desc 排序 + 双指针
     * 排序的目的：跳过重复解
     * 双指针：简化3重循环，从left+right=-target，如果小则left右移动，大则right左移动
     * 需要注意的是，这边为了跳过重复解，left相同时需要再移动一下
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] + nums[i] == 0) {
                    result.add(Arrays.asList(nums[left], nums[right], nums[i]));
                    do {
                        left++;
                    } while (left <= right && nums[left] == nums[left - 1]);
                } else if (nums[left] + nums[right] + nums[i] < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

}
