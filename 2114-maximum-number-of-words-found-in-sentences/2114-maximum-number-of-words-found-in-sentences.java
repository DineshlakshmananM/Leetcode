class Solution {
    public int mostWordsFound(String[] sentences) {
        int c=0;
        for(String x:sentences){
            String[]s=x.split(" ");
            c=Math.max(c,s.length);
        }
        return c;
    }
}