class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        for(int i = 0; i < grid[0].length; i++){
            for(int j = 0; j < grid.length; j++){
                int c = 0;
                int v = 0;
                if (j + 1 < grid.length) {
                    c = grid[j][i];
                    v = grid[j + 1][i];
                    if (c != v) return false;
                }
                if (i + 1 < grid[0].length) {
                    c = grid[j][i];
                    v = grid[j][i + 1];
                    if (c == v) return false;
                }
            }
        }
        return true;
    }
}
