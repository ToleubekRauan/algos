package maximum_bags_with_full;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        int[] cap = {10,2,2};
        int[] rocs = {2,2,0};
        int adds = 100;
        System.out.println(maximumBags(cap, rocs, adds));
    }

    static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < capacity.length; i++) {
            priorityQueue.add(capacity[i] - rocks[i]);
        }
        int cnt = 0;
        while (!priorityQueue.isEmpty() && additionalRocks > 0) {
            int val = priorityQueue.poll();
            if (val == 0) {
                cnt++;
            }else {
               if (additionalRocks - val >= 0) {
                   cnt++;
               }
               additionalRocks -= val;
            }

        }
        return cnt;
    }
}
