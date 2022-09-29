package leetcode.code0;

import java.util.Stack;

/**
 * @date 2022/9/6 14:26
 * @author huangchenguang
 * @desc 有效的括号
 */
public class Solution20 {

    public static void main(String[] args) {
        Solution20 solution20 = new Solution20();
        System.out.println(solution20.isValid("()"));
    }

    /**
     * @date 2022/9/6 14:26
     * @author huangchenguang
     * @desc 辅助栈法
     * 如果栈顶是(并且当前是)，则出栈，否则入栈
     * 优化1.字符串是奇数可以直接返回
     * 优化2.非括号字符可以直接返回
     */
    public boolean isValid(String s) {
        // 优化1
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty() && match(stack.peek(), c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    private boolean match(char a, char b) {
        if (a == '(' && b == ')') {
            return true;
        }
        if (a == '{' && b == '}') {
            return true;
        }
        if (a == '[' && b == ']') {
            return true;
        }
        return false;
    }

}
