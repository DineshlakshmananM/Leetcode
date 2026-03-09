class Solution {
    public int[] getConcatenation(int[] nums) {
         int []c1=new int[nums.length+nums.length];
      for(int i=0;i<nums.length;i++){
        c1[i]=nums[i];
        c1[i+nums.length]=nums[i];
      }
    return c1;
    }
}