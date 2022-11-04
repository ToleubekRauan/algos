package top_k_frequent;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] arr = {"i","love","leetcode","i","love","coding"};
        int k = 2;
        System.out.println(topKFrequent(arr, k));




    }

    static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();

        for (String str : words) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                Comparator.comparing((Map.Entry<String, Integer> e) -> e.getValue(), (e1, e2) -> e2 - e1)
                        .thenComparing((Map.Entry<String, Integer> e) -> e.getKey(), (e1, e2) -> e1.compareTo(e2)));

        pq.addAll(map.entrySet());

        List<String> list = new ArrayList<>();

        while (k > 0 && !pq.isEmpty()) {
            Map.Entry<String, Integer> entry = pq.poll();
            list.add(entry.getKey());
            k--;
        }

        return list;

    }

}
