import java.util.HashMap;

public class String_manipulation {
    public static void main(String[] args) {
       //find the smallest substring in the first string thay contains all charavters of the second string
       //take 2 hashmap
       //charfeq: store the frequency of each in s2
       //window count:store the fequency of chararcter in the current window of s1
       //use two pointers start and end denote the curr window
       //expland the window by moving the end pointer until all charaters in s2 coverded;
        //once a valid window in found ,shink tit from the lengthby moving the staet to minimize the window sixe
        String s1 = "SDFGHJKLCVBNAB";
        String s2 = "ABC";

        String result = findMinWindow(s1, s2);
        System.out.println("Smallest substring: " + result);
      
    }
    public static String findMinWindow(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() < s2.length()) {
            return "";
        }

        // Store frequency of each character in s2
        HashMap<Character, Integer> charFreq = new HashMap<>();
        for (char c : s2.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> windowCount = new HashMap<>();
        int start = 0, matched = 0, minLength = Integer.MAX_VALUE, minStart = 0;

        // Expand the window using the end pointer
        for (int end = 0; end < s1.length(); end++) {
            char endChar = s1.charAt(end);
            windowCount.put(endChar, windowCount.getOrDefault(endChar, 0) + 1);

            // Check if the character is in s2 and matches its required frequency
            if (charFreq.containsKey(endChar) &&
                windowCount.get(endChar).intValue() == charFreq.get(endChar).intValue()) {
                matched++;
            }

            // When all characters are matched, try to shrink the window
            while (matched == charFreq.size()) {
                if (end - start + 1 < minLength) {
                    minLength = end - start + 1;
                    minStart = start;
                }

                // Shrink the window from the start
                char startChar = s1.charAt(start);
                windowCount.put(startChar, windowCount.get(startChar) - 1);
                if (charFreq.containsKey(startChar) &&
                    windowCount.get(startChar) < charFreq.get(startChar)) {
                    matched--;
                }
                start++;
            }
            
        }
        return minLength == Integer.MAX_VALUE ? "" : s1.substring(minStart, minStart + minLength);
    }
}