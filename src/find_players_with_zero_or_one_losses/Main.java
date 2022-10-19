package find_players_with_zero_or_one_losses;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        int[][] matches = {
                {1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}
        };
        System.out.println(findWinners(matches));
    }


    public static List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> list = new ArrayList<>();

        PriorityQueue<Integer> winners = new PriorityQueue<>();
        PriorityQueue<Integer> loosers = new PriorityQueue<>();

        for (int[] match : matches) {
            winners.add(match[0]);
            loosers.add(match[1]);

            if (winners.contains(match[1])) {
                winners.removeIf(integer -> integer == match[1]);
            }
        }

        list.add(new ArrayList<>(winners));

        return list;
    }
}
