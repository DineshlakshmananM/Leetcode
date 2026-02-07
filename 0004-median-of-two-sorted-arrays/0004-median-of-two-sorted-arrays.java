class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int n=n1+n2;
        int[]arr=new int[n];
        for(int i=0;i<n1;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<n2;i++){
            arr[n1+i]=nums2[i];
        }
        Arrays.sort(arr);
        int c=n/2;
        if(n%2==0){
            return (arr[c-1]+arr[c])/2.0;
        }
        else{
            return arr[c];
        }
    }
}