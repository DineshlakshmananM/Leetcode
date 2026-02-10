class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int c=Math.abs(arr[0]-arr[1]);
        for(int i=0;i<arr.length-1;i++){
            int v=Math.abs(arr[i]-arr[i+1]);
            if(v!=c) return false;
        }
        return true;
    }
}