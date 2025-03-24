import java.util.HashMap;

public class leetcode76 {
        public static String minWindow(String s, String t) {
        if (s.length() < t.length() || s.isEmpty() || t.isEmpty()) return "";
        
        HashMap<Character, Integer> targetFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetFreq.put(c, targetFreq.getOrDefault(c, 0) + 1);
        }
        
        int left = 0, right = 0, minStart = 0, minLen = Integer.MAX_VALUE, count = 0;
        HashMap<Character, Integer> windowFreq = new HashMap<>();
        
        while (right < s.length()) {
            char c = s.charAt(right);
            windowFreq.put(c, windowFreq.getOrDefault(c, 0) + 1);
            
            if (targetFreq.containsKey(c) && windowFreq.get(c) <= targetFreq.get(c)) {
                count++;
            }
            
            while (count == t.length()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }
                
                char leftChar = s.charAt(left);
                windowFreq.put(leftChar, windowFreq.get(leftChar) - 1);
                if (targetFreq.containsKey(leftChar) && windowFreq.get(leftChar) < targetFreq.get(leftChar)) {
                    count--;
                }
                left++;
            }
            right++;
        }
        
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
    
    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC")); // Output: "BANC"
        System.out.println(minWindow("a", "a"));              // Output: "a"
        System.out.println(minWindow("a", "aa"));             // Output: ""
    }
}
