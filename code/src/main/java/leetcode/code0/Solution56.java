package leetcode.code0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @date 2022/11/10 10:45
 * @author huangchenguang
 * @desc 合并区间
 */
public class Solution56 {

    /**
     * @date 2022/11/10 11:30
     * @author huangchenguang
     * @desc 1.先按照区间的左边界排序 2.遍历区间，如果当前区间的左边界大于等于上一个区间的右边界，则不合并，将当前区间加入结果集中，否则的话是进行合并
     */
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> temp = new ArrayList<>();
        temp.add(intervals[0]);
        for (int i = 0; i < intervals.length; i++) {
            int l = intervals[i][0], r = intervals[i][1];
            if (temp.size() == 0 || temp.get(temp.size() - 1)[1] < l) {
                temp.add(new int[]{l, r});
            } else {
                temp.get(temp.size() - 1)[1] = Math.max(temp.get(temp.size() - 1)[1], r);
            }
        }
        return temp.toArray(new int[temp.size()][]);
    }

}
