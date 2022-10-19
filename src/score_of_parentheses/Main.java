package score_of_parentheses;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // (14)
        System.out.println(scoreOfParentheses("(()(()()))"));
    }

    public static int scoreOfParentheses(String s) {
        /*
        (4)
        */
        Stack<String> stack = new Stack<>();
        int cnt = 0;

        for (String ch : s.split("")) {
            if (ch.equals("(")) {
                stack.push("(");
            }else if (ch.equals(")")) {
                if (!stack.peek().equals("(")) {
                    int tmp = 0;
                    while (!stack.peek().equals("(")) {
                        String str = stack.pop();
                        tmp += Integer.parseInt(str);
                    }
                    stack.pop();
                    stack.push(String.valueOf(tmp * 2));
                }else {
                    stack.pop();
                    stack.push("1");

                }

            }
        }
        while (!stack.isEmpty()) {
            cnt += Integer.parseInt(stack.pop());
        }
        return cnt;
    }
}
