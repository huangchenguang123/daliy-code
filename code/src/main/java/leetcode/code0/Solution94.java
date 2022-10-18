package leetcode.code0;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2022/10/18 10:49
 * @author huangchenguang
 * @desc 二叉树的中序遍历
 */
public class Solution94 {

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
     * @date 2022/10/18 10:55
     * @author huangchenguang
     * @desc 中序遍历，左，根，右
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, result);
        return result;
    }

    private void dfs(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        dfs(root.left, result);
        result.add(root.val);
        dfs(root.right, result);
    }

}
