class Solution {
    public int[] evenOddBit(int n) {
        int e=0;
        int o=0;
        int v=0;
        while(n!=0){
            int r=n%2;
            if(r==1){
            if(v%2==0){ e++;}
            else {o++;}}
            v++;
            n/=2;
        }
        return new int[]{e,o};
    }
}