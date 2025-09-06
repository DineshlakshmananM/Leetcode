class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int[]b=new int[grid[0].length];
       // System.out.println(grid.length);
       // System.out.println(grid[0].length);
        for(int i=0;i<grid[0].length;i++){
            int v=0;
            for(int j=0;j<grid.length;j++){
                String s=String.valueOf(grid[j][i]);
                if(s.length()>v) v=s.length();
            }
            b[i]=v;
        }
        return b;
    }
}