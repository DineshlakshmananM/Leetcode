class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][]b=new int[m][n];
       if(original.length!=(m*n)) return new int [][] {} ;
       else{
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                b[i][j]=original[c++];
            }
        }
       }
       return b;
    }
}