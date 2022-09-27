package most_frequent_even_element;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(mostFrequentEven(nums));
    }

    public static int mostFrequentEven(int[] nums) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(nums.length, Collections.reverseOrder());

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (num % 2 ==0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        priorityQueue.addAll(map.values());
        /*
        2 - 2
        4 - 2
        6 - 1
         */




        return -1;
    }

}
