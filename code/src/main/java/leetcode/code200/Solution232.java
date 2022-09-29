package leetcode.code200;

import java.util.Stack;

/**
 * @date 2022/9/29 10:04
 * @author huangchenguang
 * @desc 用栈实现队列
 */
public class Solution232 {

    private Stack<Integer> stack1;

    private Stack<Integer> stack2;

    /**
     * @date 2022/9/29 10:07
     * @author huangchenguang
     * @desc 用2个栈模拟队列
     */
    public Solution232() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

}
