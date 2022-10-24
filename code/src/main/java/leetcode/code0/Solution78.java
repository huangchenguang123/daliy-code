package leetcode.code0;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2022/10/24 10:26
 * @author huangchenguang
 * @desc 子集
 */
public class Solution78 {

    /**
     * @date 2022/10/24 11:29
     * @author huangchenguang
     * @desc 求所有子集，对于n个数来说，每一个数都有有和没有2种情况，那么可以看作二进制，所以一共2^n种情况
     * 遍历所有情况，如果当前位为1的话，就把当前元素加到临时队列里，每轮遍历完成之后就是一组子集
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        double times = Math.pow(2, n);
        for (int i = 0; i < times; i++) {
            List<Integer> temp = new ArrayList<>();
            int ii = i;
            for (int num : nums) {
                if (ii % 2 != 0) {
                    temp.add(num);
                }
                ii >>= 1;
            }
            result.add(temp);
        }
        return result;
    }

}
