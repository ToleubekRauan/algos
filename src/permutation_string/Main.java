package permutation_string;

public class Main {

    public static void main(String[] args) {
        permute("ABC", "");
    }


    private static void permute(String word, String ans) {

        if (word.length() == 0) {
            System.out.println(ans);
        }


        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            String remain = word.substring(0, i) + word.substring(i + 1);

            permute(remain, ans + ch);
        }
    }

}
