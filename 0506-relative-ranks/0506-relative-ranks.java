class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[]s=new String[score.length];
        int[]c=score.clone();
        Arrays.sort(c);
        int v=0;
        for(int j=c.length-1;j>=0;j--){
            int x=c[j];
        for(int i=0;i<score.length;i++){
          if(score[i]==x){
            if(v==0) s[i]="Gold Medal";
            else if(v==1) s[i]="Silver Medal";
            else if(v==2)s[i]="Bronze Medal";
            else s[i]=Integer.toString(v+1);
          }
        }
        v++;
      }
      return s;
    }
}