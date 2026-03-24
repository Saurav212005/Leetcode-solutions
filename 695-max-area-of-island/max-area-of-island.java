class Solution {

    int backtrack(int[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0) {
            return 0;
        }
        grid[row][col] = 0;

        return 1 +
                backtrack(grid, row + 1, col) +
                backtrack(grid, row - 1, col) +
                backtrack(grid, row, col + 1) +
                backtrack(grid, row, col - 1);
    }
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int area = backtrack(grid, i, j);
                    max = Math.max(max, area);
                }
            }
        }

        return max;
    }
}