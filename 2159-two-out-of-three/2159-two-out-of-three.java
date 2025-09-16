class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer>l=new ArrayList<>();
        int[]a=new int[1000];
        int[]b=new int[1000];
        int[]c=new int[1000];
        for(int x:nums1){
            a[x]=1;
        }
         for(int x:nums2){
            b[x]=1;
        }
         for(int x:nums3){
            c[x]=1;
        }
        for(int i=0;i<1000;i++){
           if(a[i]+b[i]+c[i]>=2) if(!l.contains(i)) l.add(i);
        }
        return l;
    }
}