package permutation_in_string;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String s1 = "adc";
        String s2 = "dcda";
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            set.add(s2.substring(i, i + s1.length()));
        }
        System.out.println(set);
        Set<String> permutations = new HashSet<>();
        permute(s1, "", permutations);
        for (String perm : permutations) {
            if (set.contains(perm)) {
                return true;
            }
        }
        return false;

    }

    static void permute(String s, String answer, Set<String> permutations) {

        if (s.length() == 0)
        {
            permutations.add(answer);
            return;
        }

        for(int i = 0 ;i < s.length(); i++)
        {
            char ch = s.charAt(i);
            String left_substr = s.substring(0, i);
            String right_substr = s.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, answer + ch, permutations);
        }
    }


}
