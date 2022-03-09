package arithmetic_calculus;

import java.awt.*;

public class InToPos {

    private StackX stackX;
    private String input;
    private String output = "";

    public InToPos(String in) {
        input = in;
        int stackSize = input.length();
        stackX = new StackX(stackSize);
    }

    public String doTransl() {

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);
            stackX.displayStack("For " + ch + " ");
            switch(ch) {
                case '+':
                case '-':
                    getOper(ch, 1);
                    break;
                case '*':
                case '/':
                    getOper(ch, 2);
                    break;
                case '(':
                    stackX.push(ch);
                    break;
                case ')':
                    getParen();
                    break;
                default:
                    output = output + ch;
            }
        }
        while (!stackX.isEmpty()) {
            stackX.displayStack("While ");
            output += stackX.pop();
        }
        stackX.displayStack("End   ");     // *диагностика*
        return output;
    }

    private void getParen() {
        while (!stackX.isEmpty()) {
            char chx = stackX.pop();
            if (chx == '(') {
                break;
            }else {
               output += chx;
            }
        }
    }

    private void getOper(char opThis, int prec1) {
        while (!stackX.isEmpty()) {
            char opTop = stackX.pop();
            if (opTop == '(') {
                stackX.push(opTop);
                break;
            }else {
                int prec2;
                if (opTop == '+' || opTop == '-') {
                    prec2 = 1;
                }else {
                    prec2 = 2;
                }

                if (prec2 < prec1) {
                    stackX.push(opTop);
                    break;
                }else {
                    output += opTop;
                }
            }

        }
        stackX.push(opThis);

    }
}
