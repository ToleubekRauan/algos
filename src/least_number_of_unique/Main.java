package least_number_of_unique;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5,5,4};
        int k = 1;

        System.out.println(findLeastNumOfUniqueInts(arr, k));
    }

    static int findLeastNumOfUniqueInts(int[] arr, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(map.entrySet());


        return pq.size();

    }
}
