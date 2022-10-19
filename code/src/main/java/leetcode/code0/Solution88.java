package leetcode.code0;

/**
 * @date 2022/10/19 14:15
 * @author huangchenguang
 * @desc 合并两个有序数组
 */
public class Solution88 {

    /**
     * @date 2022/10/19 14:50
     * @author huangchenguang
     * @desc 归并排序，但是由于是原地，不使用额外空间，所以需要从后面开始归并
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length - 1;
        int l1 = m - 1;
        int l2 = n - 1;
        while (l1 >= 0 && l2 >= 0) {
            if (nums1[l1] > nums2[l2]) {
                nums1[i] = nums1[l1];
                l1--;
            } else {
                nums1[i] = nums2[l2];
                l2--;
            }
            i--;
        }
        while (l2 >= 0) {
            nums1[i] = nums2[l2];
            l2--;
            i--;
        }
    }

}
