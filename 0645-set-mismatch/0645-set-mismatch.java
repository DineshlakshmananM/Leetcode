class Solution {
    public int[] findErrorNums(int[] nums) {
      int c=0;
      int v=0;
      int []f=new int[nums.length+1];
      for(int x:nums){
        f[x]++;
      }
      for(int i=1;i<=nums.length;i++){
        if(f[i]==2) c=i;
        if(f[i]==0) v=i;
      }
       return new int[]{c,v};
    }
}