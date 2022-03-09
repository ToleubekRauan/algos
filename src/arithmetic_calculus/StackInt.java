package arithmetic_calculus;

public class StackInt {

    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackInt(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int j) {
        stackArray[++top] = j;
    }

    public int pop() {
        return stackArray[top--];
    }

    public int peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public int peekN(int pos) {
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


    public StackInt copy() {
        StackInt stackX = new StackInt(this.maxSize);
        for (int i = 0; i < maxSize; i++) {
            stackX.push(this.peekN(i));
        }
        return stackX;
    }


}
