package adding_spaces_to_string;

public class Main {

    public static void main(String[] args) {
        String str = "LeetcodeHelpsMeLearn";
        int[] arr = {8,13,15};
        System.out.println(addSpaces(str, arr));

    }

    static public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();

        int sp = 0, i = 0;


        while (i < s.length()) {
            if (sp < spaces.length && spaces[sp] == i) {
                sb.append(" ");
                sp++;
            }else {
                sb.append(s.charAt(i));
                i++;
            }
        }



        return sb.toString();
    }
}
