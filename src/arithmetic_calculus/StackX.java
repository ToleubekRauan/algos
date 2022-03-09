package arithmetic_calculus;

public class StackX{

    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j) {
        stackArray[++top] = j;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public char peekN(int pos) {
        return stackArray[pos];
    }

    public void displayStack(String s) {
        System.out.println(s);
        System.out.print("Stack (bottom-->top): ");
        for (int j = 0; j < size(); j++) {
            System.out.print(peekN(j));
            System.out.print(' ');
        }
        System.out.println("");
    }


    public StackX copy() {
        StackX stackX = new StackX(this.maxSize);
        for (int i = 0; i < maxSize; i++) {
            stackX.push(this.peekN(i));
        }
        return stackX;
    }


}
