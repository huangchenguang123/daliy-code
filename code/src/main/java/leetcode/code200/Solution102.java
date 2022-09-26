package leetcode.code200;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @date 2022/9/26 09:22
 * @author huangchenguang
 * @desc 二叉树的层序遍历
 */
public class Solution102 {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        Solution102 solution102 = new Solution102();
        System.out.println(solution102.levelOrder(treeNode1));
    }

    private static class TreeNode {

        int val;

        TreeNode left;

        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

    /**
     * @date 2022/9/26 09:25
     * @author huangchenguang
     * @desc BFS，使用队列做层序遍历
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new LinkedList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() != 0) {
            int n = queue.size();
            List<Integer> level = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                TreeNode current = queue.poll();
                level.add(current.val);
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            result.add(level);
        }
        return result;
    }

}
