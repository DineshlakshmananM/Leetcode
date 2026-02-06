class Solution {
    public int minOperations(int[] nums, int k) {
        int c=0;
        for(int x:nums){
            c+=x;
        }
        if(c<k){
            return c;
        }
        if(c%k==0){
            return 0;
        }
        return c%k;
    }
}