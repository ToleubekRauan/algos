package linked_hashset;

import java.util.LinkedHashSet;

public class LongestSubstringWithoutRepeatingCharacters {


    public static void main(String[] args) {
        String longString = "aab";
        System.out.println(longestSubstring(longString));
    }

    private static int longestSubstring(String longString) {
        int[] arr = new int[128];
        int left = 0, right = 0;
        int res = 0;

        while (right < longString.length()) {
            char r = longString.charAt(right);
            arr[r]++;

            while (arr[r] > 1) {
                char l = longString.charAt(left);
                arr[l]--;
                left++;
            }

            res = Math.max(res, right - left + 1);
            right++;

        }
        return res;

    }
}
