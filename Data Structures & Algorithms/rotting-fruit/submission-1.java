class Solution {

    int[][] directions = {
        {1, 0},
        {0, 1},
        {-1, 0},
        {0, -1}
    };

    public int orangesRotting(int[][] grid) {

        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                }

                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int minutes = 0;

        while (!queue.isEmpty() && fresh > 0) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                int[] current = queue.poll();

                for (int[] dir : directions) {

                    int row = current[0] + dir[0];
                    int col = current[1] + dir[1];

                    if (row < 0 || row >= grid.length ||
                        col < 0 || col >= grid[0].length) {
                        continue;
                    }

                    if (grid[row][col] == 1) {
                        grid[row][col] = 2;
                        fresh--;

                        queue.add(new int[]{row, col});
                    }
                }
            }

            minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }
}