package queen_attack;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[][] queens = {
                {0,1},{1,0},{4,0},{0,4},{3,3},{2,4}
        };
        int[] king = {0 ,0};
        System.out.println(queensAttacktheKing(queens, king));
    }

    public static List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> list = new ArrayList<>();



        return list;
    }
}
