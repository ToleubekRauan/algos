package find_the_winner_of_the_circular_game;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(findTheWinner(5, 1));
    }

    public static int findTheWinner(int n, int k) {
        int pos = 0;

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        while (list.size() > 1) {
            int curPos = (pos + k - 1) % list.size();
            list.remove(curPos);
            pos = (curPos) % list.size();
        }

        return list.get(0);
    }
}
