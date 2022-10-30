package max_vowels;

import java.util.HashSet;
import java.util.Set;

public class Main {


    public static void main(String[] args) {

        System.out.println(maxVowels("abciiidef", 3));
    }

    static int maxVowels(String s, int k) {
        /*
        leetcode
        */
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int max = 0;

        for (int i = 0; i < k; i++) {
            if (set.contains(s.charAt(i))) {
                max++;
            }
        }

        for (int i = 1; i < s.length() - k - 1; i++)  {
            char ch = s.charAt(i + k - 1);
            if (set.contains(ch)) {

            }
        }



        return max;
    }
}
