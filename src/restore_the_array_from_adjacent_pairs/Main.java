package restore_the_array_from_adjacent_pairs;

import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        int[][] pairs = {
                {2, 1}, {3, 4}, {3, 2}
        };
        restoreArray(pairs);
    }

    public static int[] restoreArray(int[][] pairs) {
        //1. find only appear once
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < pairs.length; i++) {
            addOrRemove(map, pairs, i, 0);
            addOrRemove(map, pairs, i, 1);
        }
        int val = map.values().iterator().next();
        System.out.println(val);
        System.out.println(map);
        return new int[]{};
    }

    static void addOrRemove(Map<Integer, Integer> map, int[][] pairs, int i, int j) {
        Integer val = map.get(pairs[i][j]);
        if (val == null) {
            map.put(pairs[i][j], i);
        } else {
            map.remove(pairs[i][j]);
        }
    }
}
