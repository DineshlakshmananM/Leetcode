class Solution {
    public int rotatedDigits(int x) {
        int c=0;
        for(int i=1;i<=x;i++){
            if(mirror(i)) c++;
        }
        return c;
    }
    public boolean mirror(int n){
    boolean changed = false;

    while (n > 0) {
        int d = n % 10;
        if (d == 3 || d == 4 || d == 7)
            return false;
        if (d == 2 || d == 5 || d == 6 || d == 9)
            changed = true;
        n /= 10;
    }

    return changed;
}

    }
