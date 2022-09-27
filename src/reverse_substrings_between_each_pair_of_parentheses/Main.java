package reverse_substrings_between_each_pair_of_parentheses;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String word = "a(bcdefghijkl(mno)p)q";
        /*
        (
        ed
        (
        etco
      )
        _


         */

        System.out.println(reverseParentheses(word));
    }

    public static String reverseParentheses(String s) {

        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (sb.length() > 0) {
                    stack.push(sb.toString());
                    sb.setLength(0);
                }
            } else if (s.charAt(i) == ')') {
                if (sb.length() > 0) {
                    stack.push(sb.toString());
                    sb.setLength(0);
                }
                final String str = new StringBuilder(stack.pop()).reverse().toString();
                String second = "";
                if (!stack.isEmpty()) {
                    second = stack.pop();
                }
                if (i == s.length() - 1) {
                    stack.push(str + new StringBuilder(second).reverse());
                }else {
                    stack.push(second + str);
                }
            } else {
                sb.append(s.charAt(i));
            }
        }

        return stack.pop();
    }
}
