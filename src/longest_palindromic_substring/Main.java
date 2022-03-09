package longest_palindromic_substring;

public class Main {
    public static void main(String[] args) {
        //String str = "abaxyzzyxf";
        String str = "abbcdefkGkfedc";
        System.out.println(longestPalindromicSubstring(str));
    }

    public static String longestPalindromicSubstring(String str) {
        String output = String.valueOf(str.charAt(0));
        for (int i = 0; i < str.length(); i++) {
            int start = i, end = i+1;
            if ((i + 1 < str.length()) && str.charAt(i) != str.charAt(i + 1)) {
                continue;
            }else if ((i + 2 < str.length()) && str.charAt(i) == str.charAt(i + 2)) {
               end+=1;
            }else {
                continue;
            }
            while ((start - 1 >= 0) && (end + 1 < str.length()) && str.charAt(start - 1) == str.charAt(end + 1)) {
                start--;
                end++;
            }
            String tmp = str.substring(start, end+1);
            if (tmp.length() > output.length()) {
                output = tmp;
            }
        }
        return output;
    }
}
