class Solution {
    int [][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        
        int r = heights.length;
        int c = heights[0].length;
        
        boolean [][] p = new boolean [r][c];
        boolean [][] a = new boolean [r][c];
        
        for(int i = 0; i < c; i++){
            dfs(heights, 0, i, Integer.MIN_VALUE, p);
            dfs(heights, r - 1, i, Integer.MIN_VALUE, a);
        }
        
        for(int i = 0; i < r; i++){
            dfs(heights, i, 0, Integer.MIN_VALUE, p);
            dfs(heights, i, c - 1, Integer.MIN_VALUE, a);
        }
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(p[i][j] && a[i][j]){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        
        return res;
    }
    
    void dfs(int[][] heights, int i, int j, int pre, boolean[][] visited){
        
        if(i < 0 || i >= heights.length || j < 0 || j >= heights[0].length){
            return;
        }
        
        if(heights[i][j] < pre || visited[i][j]){
            return;
        }
        
        visited[i][j] = true;
        
        for(int[] d: dir){
            dfs(heights, i + d[0], j + d[1], heights[i][j], visited);
        }
    }
}