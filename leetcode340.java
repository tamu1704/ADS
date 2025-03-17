import java.util.*;;

public class leetcode340 {
    public static int longest(String s, int k) {
        if (s==null||s.length()==0||k==0) return 0;

        Map<Character, Integer> m = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            m.put(ch, m.getOrDefault(ch, 0) + 1);

            while (m.size() > k) {
                char leftChar = s.charAt(left);
                m.put(leftChar, m.get(leftChar) - 1);
                if (m.get(leftChar) == 0) {
                    m.remove(leftChar);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        System.out.println(longest(s, k)); 
    }
}