class Solution {
    public List<Integer> selfDividingNumbers(int l, int r) {
        List<Integer> l1=new ArrayList<>();
        for(int i=l;i<=r;i++){
            if(selfdiv(i)){
                l1.add(i);
            }
        }
        return l1;
    }
    public boolean selfdiv(int n){
        int c=n;
        while(n>0){
              int r= n % 10;
        if (r == 0 || c % r != 0) return false;
        n /= 10;
    }
    return true;
    }
}