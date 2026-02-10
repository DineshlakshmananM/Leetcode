class Solution {
    public String truncateSentence(String s, int k) {
        String ans = "";
        String[] a = s.split("\\s+");
        if (k >= a.length) {
            ans = s;
        } else {
            int c = 0;
            for (String x : a) {
                if (c != k) {
                    c++;
                    if (c == k) {
                        ans += x;
                    } else {
                        ans += x + " ";
                    }
                } else {
                    break;
                }
            }
        }
        return ans;
    }
}