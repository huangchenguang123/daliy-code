package leetcode.code200;

/**
 * @date 2023/4/7 15:50
 * @author huangchenguang
 * @desc 岛屿数量
 */
public class Solution200 {

    /**
     * @date 2023/4/7 15:55
     * @author huangchenguang
     * @desc dfs深度遍历，将遍历过的岛屿置为0，遍历过的岛屿不再遍历
     */
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i , j);
                }

            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (grid[i][j] == '1') {
            grid[i][j] = '0';
            if (i - 1 >= 0) {
                dfs(grid, i - 1, j);
            }
            if (i + 1 < grid.length) {
                dfs(grid, i + 1, j);
            }
            if (j - 1 >= 0) {
                dfs(grid, i, j - 1);
            }
            if (j + 1 < grid[0].length) {
                dfs(grid, i, j + 1);
            }
        }
    }

}
