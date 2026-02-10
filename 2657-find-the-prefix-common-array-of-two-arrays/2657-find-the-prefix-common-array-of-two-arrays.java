class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int []f=new int[A.length+1];
        int []ans=new int[A.length];
        int c=0;
        for(int i=0;i<A.length;i++){
            if(++f[A[i]]==2)c++;
            if(++f[B[i]]==2)c++;
            ans[i]=c;
        }
        return ans;
    }
}