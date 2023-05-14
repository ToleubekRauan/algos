package restore_array;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        int[][] pairs = {
                {100000,-100000},
//                {1,4},
//                {-3,1}
        };
        /*
        2 - 1,3
        1 - 2
        3 - 4,2
        4 - 3

         */
        System.out.println(Arrays.toString(restoreArray(pairs)));
    }

    public static int[] restoreArray(int[][] pairs) {
        int[] arr = new int[pairs.length + 1];
        int idx = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        Set<Integer> used = new HashSet<>();

        for (int[] pair : pairs) {
            List<Integer> l1 = map.getOrDefault(pair[0], new ArrayList<>());
            l1.add(pair[1]);
            map.put(pair[0], l1);

            List<Integer> l2 = map.getOrDefault(pair[1], new ArrayList<>());
            l2.add(pair[0]);
            map.put(pair[1], l2);
        }

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() == 1) {
                arr[idx++] = entry.getKey();
                arr[idx] = entry.getValue().get(0);
                used.add(entry.getKey());
                used.add(entry.getValue().get(0));
                break;
            }
        }

        while (used.size() != arr.length) {
            List<Integer> list = map.get(arr[idx]);
            for (int num : list) {
                if (!used.contains(num)) {
                    arr[++idx] = num;
                    used.add(num);
                }
            }
        }
        return arr;
    }


}
