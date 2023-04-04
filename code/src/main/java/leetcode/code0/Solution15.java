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
     * 需要注意的是，这边为了跳过重复解，left和right相同时需要再移动一下
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[l] + nums[r] + nums[i];
                if (sum == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    result.add(temp);
                    while (l < r && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    l++;
                    while (l < r && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return result;
    }

}
