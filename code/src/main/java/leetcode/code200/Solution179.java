package leetcode.code200;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @date 2022/9/28 15:14
 * @author huangchenguang
 * @desc 最大数
 */
public class Solution179 {

    public static void main(String[] args) {
        Solution179 solution179 = new Solution179();
        System.out.println(solution179.largestNumber(new int[]{0, 0}));
    }

    /**
     * @date 2022/9/28 17:18
     * @author huangchenguang
     * @desc 比较a+b与b+a的大小，局部最大就能保证整体最大
     */
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = "" + nums[i];
        }
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo((o1 + o2)));
        if (Objects.equals(arr[0], "0")) {
            return "0";
        }
        StringBuilder builder = new StringBuilder();
        for (String s : arr) {
            builder.append(s);
        }
        return builder.toString();
    }

}
