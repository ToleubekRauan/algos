package permutation_in_string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String s1 = "adc";
        String s2 = "dcda";
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        List<String> list = new ArrayList<>();
        permutation(list, s1, "");

        for (String word : list) {
            if (s2.indexOf(word) != -1) {
                return true;
            }
        }
        return false;

    }

    private static void permutation(List<String> perms, String word, String ans) {
        if (word.length() == 0) {
            perms.add(ans);
        }

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            String remain = word.substring(0, i) + word.substring(i + 1);

            permutation(perms, remain, ans + ch);
        }
    }


}
