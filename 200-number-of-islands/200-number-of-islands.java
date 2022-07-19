class Solution {
    public int numIslands(char[][] grid) {
        int res = 0;
        int m = grid.length, n = grid[0].length;
        // traverse the grid
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (grid[i][j] == '1') {
                    // discovers a new island
                    res++;
                    // submerge the island
                    dfs(grid, i, j);
                }
            }
        }
        return res;
    }
    
    void dfs(char[][] grid, int i, int j) {
        int m = grid.length, n = grid[0].length;
        if (i < 0 || j < 0 || i >=m || j>= n) {
            return;
        }
        if (grid[i][j] == '0') {
            return;
        }
        // submerge the island
        grid[i][j] = '0';
        // submerge the surrounding island
        dfs(grid, i+1, j);
        dfs(grid, i, j+1);
        dfs(grid, i-1, j);
        dfs(grid, i, j-1);
    }
}