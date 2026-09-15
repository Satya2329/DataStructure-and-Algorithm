package Arrays_String;
import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }
        Map<Character, Integer> dictT = new HashMap<>();
        for (char c : t.toCharArray()) {
            dictT.put(c, dictT.getOrDefault(c, 0) + 1);
        }
        int required = dictT.size();
        int formed = 0;
        Map<Character, Integer> windowCounts = new HashMap<>();
        int l = 0, r = 0;
        int[] ans = {-1, 0, 0};

        while (r < s.length()) {
            char c = s.charAt(r);
            windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);
            if (dictT.containsKey(c) && windowCounts.get(c).intValue() == dictT.get(c).intValue()) {
                formed++;
            }

            while (l <= r && formed == required) {
                char leftChar = s.charAt(l);

                if (ans[0] == -1 || (r - l + 1) < ans[0]) {
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }

                windowCounts.put(leftChar, windowCounts.get(leftChar) - 1);
                if (dictT.containsKey(leftChar) && windowCounts.get(leftChar).intValue() < dictT.get(leftChar).intValue()) {
                    formed--;
                }

                l++;
            }

            r++;
        }

        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println("Minimum window: " + minWindow(s, t)); // Output: "BANC"
    }
}
