package hanoi;

import java.util.Stack;

public class Main {


    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi(3);
        hanoi.solve();
        System.out.println("begin:" + hanoi.towerA);
        System.out.println("end:" + hanoi.towerC);
        System.out.println("temp:" + hanoi.towerB + "\n\n");
    }

}

class Hanoi {
    private final int numDiscs;
    public final Stack<Integer> towerA = new Stack<>();
    public final Stack<Integer> towerB = new Stack<>();
    public final Stack<Integer> towerC = new Stack<>();

    public Hanoi(int numDiscs) {
        this.numDiscs = numDiscs;
        for (int i = 1; i <= numDiscs; i++) {
            towerA.push(i);
        }
    }

    private void move(Stack<Integer> begin, Stack<Integer> end, Stack<Integer> temp, int n) {
        System.out.println("begin:" + begin);
        System.out.println("end:" + end);
        System.out.println("temp:" + temp + "\n\n");
        if (n == 1) {
            end.push(begin.pop());
        }else {
            move(begin, temp, end, n - 1);
            move(begin, end, temp, 1);
            move(temp, end, begin, n - 1);
        }
    }

    public void solve() {
        move(towerA, towerC, towerB, numDiscs);
    }
}
