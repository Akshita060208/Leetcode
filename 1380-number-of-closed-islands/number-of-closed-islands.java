class Solution {
    public int closedIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        for (int r = 0; r < rows; r++) {
            dfs(grid, r, 0);
            dfs(grid, r, cols - 1);
        }
        for (int c = 0; c < cols; c++) {
            dfs(grid, 0, c);
            dfs(grid, rows - 1, c);
        }

        int closedIslands = 0;

        for (int r = 1; r < rows - 1; r++) {
            for (int c = 1; c < cols - 1; c++) {
                if (grid[r][c] == 0) {
                    closedIslands++;
                    dfs(grid, r, c);
                }
            }
        }

        return closedIslands;
    }

    public void dfs(int[][] grid, int r, int c) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] == 1) {
            return;
        }
        grid[r][c] = 1;

        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }
}