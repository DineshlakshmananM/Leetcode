class Solution {
    public int countSquares(int[][] matrix) {
        int c=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==1){
                    c++;
                }
            }
        }
       for(int v=2;v<=Math.max(matrix.length,matrix[0].length);v++){ 
       for(int i=0;i<=matrix.length-v;i++){
            for(int j=0;j<=matrix[0].length-v;j++){
               boolean flag=true;
                for(int x=i;x<i+v;x++){
                    for(int y=j;y<j+v;y++){
                        if(matrix[x][y]==0){
                            flag=false;
                            break;
                        }
                    }
                }
                if(flag){
                    c++;
                }
            }
       }
       } 
       return c;
    }
}