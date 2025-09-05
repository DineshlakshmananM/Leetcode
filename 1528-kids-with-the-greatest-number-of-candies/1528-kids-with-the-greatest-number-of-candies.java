class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int e) {
        List<Boolean>l=new ArrayList<>();
         int max = 0;
        for (int x : c) {
            if (x > max) max = x;
        }
        for(int i=0;i<c.length;i++){
            if((c[i]+e)>=max) l.add(true);
            else l.add(false);
        }
        return l;
    }
}