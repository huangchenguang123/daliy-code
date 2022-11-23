package leetcode.code0;

/**
 * @date 2022/11/23 14:22
 * @author huangchenguang
 * @desc 单词搜索
 */
public class Solution79 {

    private boolean result = false;

    /**
     * @date 2022/11/23 14:47
     * @author huangchenguang
     * @desc dfs遍历，用一个辅助数组来判断是否遍历过，
     * 需要注意的一点时，当这个位置的所有情况都遍历过时，回溯时需要把辅助数组中的值变为false，避免在其他dfs时的影响
     */
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean[][] temp = new boolean[board.length][board[0].length];
                dfs(board, i, j, word, 0, temp);
            }
        }
        return result;
    }

    private void dfs(char[][] board, int i , int j ,String word, int index, boolean[][] temp) {
        if (!temp[i][j] && index < word.length() && board[i][j] == word.charAt(index)) {
            temp[i][j] = true;
            index++;
            if (index == word.length()) {
                result = true;
            }
            if (i + 1 < board.length) {
                dfs(board, i + 1, j, word, index, temp);
            }
            if (i - 1 >= 0) {
                dfs(board, i - 1, j, word, index, temp);
            }
            if (j + 1 < board[0].length) {
                dfs(board, i, j + 1, word, index, temp);
            }
            if (j - 1 >= 0) {
                dfs(board, i, j - 1, word, index, temp);
            }
            // 回溯需要撤销
            temp[i][j] = false;
        }
    }

}
