package leetcode.code700;

/**
 * @date 2022/10/13 15:41
 * @author huangchenguang
 * @desc 最多能完成排序的块
 */
public class Solution769 {

    /**
     * @date 2022/10/13 15:59
     * @author huangchenguang
     * @desc 当前位置的元素必须和第i个位置在同一块内，否则排序会出错，遍历数组，遍历到最大元素对应的i
     */
    public int maxChunksToSorted(int[] arr) {
        int count = 1;
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (i > temp) {
                count++;
                temp = arr[i];
            } else {
                temp = Math.max(temp, arr[i]);
            }
        }
        return count;
    }

}
