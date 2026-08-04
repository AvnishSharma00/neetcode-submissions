class Solution {
    int count = 0;

    public void dfs(int[][] grid, boolean[][] visited, int i, int j) {

        
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            count++;
            return;
        }

        if (grid[i][j] == 0) {
            count++;
            return;
        }

       
        if (visited[i][j]) {
            return;
        }

        visited[i][j] = true;

        dfs(grid, visited, i + 1, j);
        dfs(grid, visited, i - 1, j);
        dfs(grid, visited, i, j + 1);
        dfs(grid, visited, i, j - 1);
    }

    public int islandPerimeter(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, visited, i, j);
                    return count; 
                }
            }
        }

        return 0;
    }
}