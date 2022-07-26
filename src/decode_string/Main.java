package decode_string;

import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String str3 = "3[a2[c]]";
        System.out.println(decodeString(str3));
    }


    public static String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<String> result = new Stack<>();

        String res = "";

        int index = 0;

        while (index < s.length()) {

            if (Character.isDigit(s.charAt(index))) {
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = 10 * count + (s.charAt(index) - '0');
                    index++;
                }
                counts.push(count);
            }else if (s.charAt(index) == '[') {
                result.push(res);
                res = "";
                index++;
            }else if (s.charAt(index) == ']') {
                StringBuilder sb = new StringBuilder(result.pop());
                int count = counts.pop();
                for (int i = 0; i < count; i++) {
                    sb.append(res);
                }
                res = sb.toString();
                index++;
            }else {
                res += s.charAt(index);
                index++;
            }
        }
        return res;
    }

}
