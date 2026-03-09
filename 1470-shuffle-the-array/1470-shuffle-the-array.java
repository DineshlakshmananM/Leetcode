class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int [nums.length];
       int st=0;
       int md=1;
       int j=0;
       for(int i=n;i<nums.length;i++)
       {
            arr[st]=nums[j];
            arr[md]=nums[i];
            st+=2;
            md+=2;
            j++;
       }
       return arr;

    }
}