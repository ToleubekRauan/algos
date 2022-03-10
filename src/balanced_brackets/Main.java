package balanced_brackets;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String str =")[]}";
        System.out.println(balancedBrackets(str));
    }

    public static boolean balancedBrackets(String str) {
        //([])(){}(())()()
        Stack<Character> stack = new Stack<>();
        char[] arr = str.toCharArray();
        for (char ch : arr) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }else if (ch == ')' || ch == '}' || ch == ']'){
                if (stack.isEmpty()) {
                    return false;
                }
                char cha = stack.peek();
                if (cha == '(' && ch == ')' || cha == '{' && ch == '}' || cha == '[' && ch == ']') {
                    stack.pop();
                }else {
                    stack.push(ch);
                }

            }
        }
        return stack.isEmpty();
    }
}
