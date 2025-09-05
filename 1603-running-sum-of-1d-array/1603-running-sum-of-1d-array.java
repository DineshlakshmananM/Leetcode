class Solution {
    public int[] runningSum(int[] nums) {
        int[]b=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int v=0;
            for(int j=0;j<=i;j++){
                v+=nums[j];
            }
            b[i]=v;
        }
        return b;
    }
}