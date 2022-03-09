package string_permutation;

public class Main {

    public static void main(String[] args) {
        String word = "abc";
        permutate(word);
    }

    private static void permutate(String word) {
        permutate("", word, word);
    }

    private static void permutate(String prefix, String suffix, String full) {
        if (prefix.length() == full.length()) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < full.length(); i++) {
            permutate(prefix + suffix.charAt(i), full.substring(0, i) + full.substring(i), full);
        }
    }
}
