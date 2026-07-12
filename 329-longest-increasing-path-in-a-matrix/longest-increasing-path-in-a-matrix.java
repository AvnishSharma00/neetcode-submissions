class Solution {

    private int[][] dp;
    private int[][] directions = {
        {1, 0},
        {-1, 0},
        {0, 1},
        {0, -1}
    };

    public int longestIncreasingPath(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        dp = new int[m][n];

        int ans = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans = Math.max(ans, dfs(matrix, i, j));
            }
        }

        return ans;
    }

    private int dfs(int[][] matrix, int row, int col) {

        if (dp[row][col] != 0) {
            return dp[row][col];
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int maxLength = 1;

        for (int[] dir : directions) {

            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (newRow >= 0 && newRow < m &&
                newCol >= 0 && newCol < n &&
                matrix[newRow][newCol] > matrix[row][col]) {

                maxLength = Math.max(
                    maxLength,
                    1 + dfs(matrix, newRow, newCol)
                );
            }
        }

        dp[row][col] = maxLength;

        return maxLength;
    }
}