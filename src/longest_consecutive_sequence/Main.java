package longest_consecutive_sequence;

import java.util.PriorityQueue;

public class Main {


    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));

    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.add(num);
        }

        int count = 1;
        int max = 1;

        int curr = pq.poll();

        while (!pq.isEmpty()) {
            int sec = pq.poll();
            if (sec == curr) continue;
            if (sec - curr == 1) {
                count++;
            }else {
                max = Math.max(max, count);
                count = 1;
            }
            curr = sec;
        }
        // 999999999 200 100 4


        return Math.max(max, count);
    }
}
