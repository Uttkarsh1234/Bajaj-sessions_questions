import java.util.*;
class length_longest_substring {
        public int lengthOfLongestSubstring(String s) {
                int[] hash = new int[256];
                int ans = 0, left = 0;
                for (int right = 0; right < s.length(); right++) {
                        hash[s.charAt(right)]++;
                        while (hash[s.charAt(right)] > 1) {
                                hash[s.charAt(left)]--;
                                left++;
                        }
                        ans = Math.max(ans, right - left + 1);
                }
                return ans;
        }
}
