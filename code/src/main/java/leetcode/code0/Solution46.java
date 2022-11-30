package leetcode.code0;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @date 2022/11/30 14:21
 * @author huangchenguang
 * @desc 全排列
 */
public class Solution46 {

    public static void main(String[] args) {
        Solution46 solution46 = new Solution46();
        System.out.println(solution46.permute(new int[]{1, 2, 3}));
    }

    private List<List<Integer>> result;

    private Stack<Integer> temp ;

    private boolean[] book;

    private int[] nums;

    /**
     * @date 2022/11/30 15:17
     * @author huangchenguang
     * @desc 回溯法，用一个数组book标记这个元素有没有被使用过
     * 接着遍历数组，如果没有使用过当前元素就把他加入到temp中，然后标记使用，接着递归到下一层
     */
    public List<List<Integer>> permute(int[] nums) {
        this.result = new ArrayList<>();
        temp = new Stack<>();
        book = new boolean[nums.length];
        this.nums = nums;
        dfs(0);
        return result;
    }

    private void dfs(int n) {
        if (n == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!book[i]) {
                // 标记元素使用过
                book[i] = true;
                temp.push(nums[i]);
                dfs(n + 1);
                // 回溯当前元素，恢复状态
                temp.pop();
                book[i] = false;
            }
        }
    }

}
