import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> h = new HashSet<>();
        StringBuilder s = new StringBuilder();

        for (char x : word.toCharArray()) {
            if (Character.isDigit(x)) {
                s.append(x);
            } else {
                if (s.length() > 0) {
                    String num = s.toString().replaceFirst("^0+", "");
                    if (num.isEmpty()) num = "0";
                    h.add(num);
                    s.setLength(0);
                }
            }
        }
        if (s.length() > 0) {
            String num = s.toString().replaceFirst("^0+", "");
            if (num.isEmpty()) num = "0";
            h.add(num);
        }

        return h.size();
    }
}
