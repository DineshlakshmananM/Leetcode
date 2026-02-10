class Solution {
    public int countValidWords(String sentence) {
        int c=0;
        for(String x:sentence.split("\\s+")){
           if (x.matches("^([a-z]+(-[a-z]+)?[!.,]?|[!.,])$"))  c++;
        }
        return c;
    }
}