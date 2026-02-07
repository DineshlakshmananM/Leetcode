class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev =0;
        int cp=x;
        while(x!=0){
            rev=(rev*10)+(x%10);
            x/=10;
        }
        return rev==cp;
    //     int a=x;
    //     int c=0;
    //     boolean flag=true;
    //     if(x < 0){
    //         flag= false;
    //     }
    //    while(x!=0){
    //         int rem=x%10;
    //         c+=(rem*10)+c;
    //         x=x/10;
    //    }
    //    if(a==c){
    //     flag= true;
    //    }
    //   return flag;  
     
    }
}