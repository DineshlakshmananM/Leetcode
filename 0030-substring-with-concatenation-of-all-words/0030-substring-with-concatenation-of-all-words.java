import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if (s.length() == 0 || words.length == 0) return res;
        int wordLen = words[0].length();
        int totalWords = words.length;
        int totalLen = wordLen * totalWords;
        if (s.length() < totalLen) return res;
        Map<String, Integer> map = new HashMap<>();
        for (String w : words)
            map.put(w, map.getOrDefault(w, 0) + 1);
        for (int i = 0; i < wordLen; i++) {
            int left = i;
            int count = 0;
            Map<String, Integer> seen = new HashMap<>();
            for (int right = i; right + wordLen <= s.length(); right += wordLen) {
                String word = s.substring(right, right + wordLen);
                if (map.containsKey(word)) {
                    seen.put(word, seen.getOrDefault(word, 0) + 1);
                    count++;
                    while (seen.get(word) > map.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        seen.put(leftWord, seen.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }
                    if (count == totalWords) {
                        res.add(left);
                    }
                } else {
                    seen.clear();
                    count = 0;
                    left = right + wordLen;
                }
            }
        }
        return res;
    }
}
