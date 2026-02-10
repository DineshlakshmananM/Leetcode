class Solution {
    public int[][] largestLocal(int[][] grid) {
       int r=grid.length;
       int[][] ans=new int[r-2][r-2];
       for(int i=0;i<=r-3;i++){
        for(int j=0;j<=r-3;j++){
            int max=Integer.MIN_VALUE;
            for(int x=i;x<i+3;x++){
                for(int y=j;y<j+3;y++){
                    max=Math.max(max,grid[x][y]);
                }
            }
            ans[i][j]=max;
        }
       } 
       return ans;
    }
}