class Solution {
    public int numSpecial(int[][] mat) {
        int c=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    int v=0;
                    for(int k=0;k<mat[0].length;k++){
                        if(mat[i][k]==1) v++;
                    }
                    for(int k=0;k<mat.length;k++){
                        if(mat[k][j]==1) v++;
                    } 
                     if(v==2)c++;
                }
           // System.out.print(v);
            }
        }
        return c;
    }
}