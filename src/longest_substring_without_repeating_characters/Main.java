package longest_substring_without_repeating_characters;

public class Main {

    public static void main(String[] args) {
        String word = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(word));
    }

    public static int lengthOfLongestSubstring(String longString) {
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
