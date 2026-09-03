class Solution {
    int direction[][] = {
        {0, 1},
        {1, 0},
        {-1, 0},
        {0, -1}
    };

    public int dfs(int[][] grid, boolean visited[][],
                   int i, int j, int row, int col) {

        if (i < 0 || i >= row || j < 0 || j >= col ||
            visited[i][j] || grid[i][j] == 0) {
            return 0;
        }

        visited[i][j] = true;

        int maxGold = 0;

        for (int dir[] : direction) {
            maxGold = Math.max(
                maxGold,
                dfs(grid, visited,
                    i + dir[0], j + dir[1], row, col)
            );
        }

        visited[i][j] = false;

        return grid[i][j] + maxGold;
    }

    public int getMaximumGold(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        boolean visited[][] = new boolean[row][col];

        int ans = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] != 0) {
                    ans = Math.max(
                        ans,
                        dfs(grid, visited, i, j, row, col)
                    );
                }
            }
        }

        return ans;
    }
}