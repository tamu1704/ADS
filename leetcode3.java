import java.util.HashSet;

public class leetcode3 {
        public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        
        HashSet<Character> set = new HashSet<>(); // To store characters in current window
        int left = 0, maxLen = 0;
        
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
    
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // Output: 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));   // Output: 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));  // Output: 3
    }
}
