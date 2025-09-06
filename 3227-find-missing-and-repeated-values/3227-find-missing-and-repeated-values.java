class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
      //  int[]b=new int[2];
        int c=0;
        int m=0;
        int v=grid.length*grid[0].length;
        int[]n=new int[v+1];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
             // c+=grid[i][j];
              n[grid[i][j]]++;
            }
        }
        for(int x=1;x<=v;x++){
                if(n[x]==2) m=x;
                if(n[x]==0) c=x; 
         }
        
        return new int[]{m,c};
    }
}