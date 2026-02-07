class Solution {
    public int reverse(int x) {

    int sum =0;
while(x!=0){
int num = x%10;
if ((sum > (Integer.MAX_VALUE - num) / 10) && 0<x) {
return 0; // Agar overflow hua, toh 0 return kardo
}
if ((sum < (Integer.MIN_VALUE - num) / 10) && x<0) {
return 0; // Agar overflow hua, toh 0 return kardo
}
sum = sum*10+num;
x = x/10;

    }

    return sum; 

}}