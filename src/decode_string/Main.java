package decode_string;

public class Main {

    public static void main(String[] args) {
//        String str = "3[a]2[bc]";
//        System.out.println(decodeString(str));
//
//        String str2 = "2[abc]3[cd]ef";
//        System.out.println(decodeString(str2));
        //Output: "abcabccdcdcdef"

        String str3 = "3[a2[c]]";
        System.out.println(decodeString(str3));
        //Output: "accaccacc"
    }


    public static String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        return helper(s, sb);
    }

    public static String helper(String s, StringBuilder sb) {
        boolean isStarted = false;
        int occurence = 0;
        int position = 0;
        int endPosition = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                if (isStarted) {
                    sb.append(helper(s.substring(i), new StringBuilder()));
                }
                position = i+1;
                isStarted = true;

            }else if (s.charAt(i) == ']') {
                if (!isStarted) {
                    return sb.toString();
                }
                endPosition = i;
                isStarted = false;
                String tmp = s.substring(position, endPosition);
                while (occurence-- > 1) {
                    sb.append(tmp);
                }

            }else if (Character.isDigit(s.charAt(i))) {
                if (isStarted) {
                    String str = helper(s.substring(i), new StringBuilder());
                    sb.append(str);
                }else {
                    occurence = Integer.parseInt(String.valueOf(s.charAt(i)));
                }
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
