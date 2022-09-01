package leetcode.code900;

import java.util.Objects;
import java.util.Stack;

/**
 * @author huangchenguang
 * @date 2022/8/31 16:26
 * @desc 验证栈序列
 */
class Solution964 {

    /**
     * @date 2022/9/1 10:39
     * @author huangchenguang
     * @desc 用栈来模拟
     *
     * 另一种方式是直接用数组来模拟栈，但是感觉可读性没有直接用栈好，用栈的话，流程比较清晰
     */
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack1 = new Stack<>();
        for (int i = 0, j = 0; i < pushed.length; i++) {
            stack1.push(pushed[i]);
            while (!stack1.isEmpty() && Objects.equals(stack1.peek(), popped[j])) {
                stack1.pop();
                j++;
            }
        }
        return stack1.isEmpty();
    }

}
