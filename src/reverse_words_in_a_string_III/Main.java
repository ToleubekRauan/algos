package reverse_words_in_a_string_III;

import com.sun.xml.internal.xsom.impl.scd.Step;

public class Main {

    public static void main(String[] args) {
        String word = "Let's take LeetCode contest";
        System.out.println(word);
        System.out.println(reverseWords(word));
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        for (String str : arr) {
            StringBuilder inner = new StringBuilder(str);
            sb.append(inner.reverse()).append(" ");
        }
        return sb.toString().trim();

    }
}
