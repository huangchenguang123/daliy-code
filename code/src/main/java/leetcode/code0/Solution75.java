package leetcode.code0;

/**
 * @date 2022/11/3 10:47
 * @author huangchenguang
 * @desc 颜色分类
 */
public class Solution75 {

    /**
     * @date 2022/11/3 10:47
     * @author huangchenguang
     * @desc
     */
    public void sortColors(int[] nums) {
        int p0 = 0, p1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                int temp = nums[p1];
                nums[p1] = nums[i];
                nums[i] = temp;
                p1++;
            } else if (nums[i] == 0) {
                int temp = nums[p0];
                nums[p0] = nums[i];
                nums[i] = temp;
                if (p0 < p1) {
                    temp = nums[p1];
                    nums[p1] = nums[i];
                    nums[i] = temp;
                }
                p0++;
                p1++;
            }
        }
    }

}
