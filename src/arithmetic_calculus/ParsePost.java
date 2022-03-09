package arithmetic_calculus;

public class ParsePost {


    private StackInt stackX;
    private StackX input;

    public ParsePost(StackX input) {
        this.input = input;
    }


    public int doParse() {
        stackX = new StackInt(20);
        int num1, num2, interAns;
        while (!input.isEmpty()) {
            char ch = input.pop();
            if(ch >= '0' && ch <= '9')         // Если это цифра
            // Чтение символа
            stackX.push((char)(ch-'0')); // Занести в стек
            else {
                num2 = stackX.pop();
                num1 = stackX.pop();
                switch(ch)
                {
                    case '+':
                        interAns = num1 + num2;
                        break;
                    case '-':
                        interAns = num1 - num2;
                        break;
                    case '*':
                        interAns = num1 * num2;
                        break;
                    case '/':
                        interAns = num1 / num2;
                        break;
                    default:
                        interAns = 0;
                }
                stackX.push(interAns);
            }
        }
        interAns = stackX.pop();
        return interAns;
    }
}
