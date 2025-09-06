class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
       int[]b=new int[2];
       int c=0;
       for(int i=0;i<mat.length;i++){
        int v=0;
        for(int j=0;j<mat[0].length;j++){
           if(mat[i][j]==1) v++;
        }
        if(v>c){
             b[0]=i; 
             b[1]=v; 
             c=v;}
       } 
       return b;
    }
}