class Solution {
    public void rotate(int[][] m) {
        int n=m.length;
        int[][]c=new int[n][n];
        for(int i=0;i<n;i++){
            int d=0;
            for(int j=n-1;j>=0;j--){
             c[i][d++]=m[j][i];
       
            }
        } 
          for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                   m[i][j]=c[i][j];
            } 
            }
        
        
    }
}