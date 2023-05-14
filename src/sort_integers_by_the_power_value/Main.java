package sort_integers_by_the_power_value;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int lo = 1;
        int hi = 1000;
        int k = 777;

        System.out.println(getKth(lo, hi, k));
    }

    public static int getKth(int lo, int hi, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int idx = 0;
        int[] arr = new int[hi - lo + 1];
        for (int i = lo; i <= hi; i++) {
            int power = count(i);
            arr[idx] = power;
            List<Integer> list = map.getOrDefault(power, new ArrayList<>());
            list.add(idx);
            map.put(power, list);
            idx++;
        }

        Arrays.sort(arr);
        for (int num : map.get(arr[k -1 ])) {
            System.out.println(num);
        }

        return map.get(arr[k -1 ]).get(0) + lo;

    }

    private static int count(int n) {
        if (n == 1) {
            return 0;
        }
        if (n % 2 == 0) {
            return 1 + count(n / 2);
        }else {
            return 1 + count(3 * n + 1);
        }
    }
}
