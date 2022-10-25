package minimum_limit_of_balls;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int[] arr = {9};
        int max = 2;
        System.out.println(minimumSize(arr, max));

    }

    static int minimumSize(int[] nums, int maxOperations) {
        PriorityQueue<Integer> q = new PriorityQueue<>((c2,c1) -> c1 - c2);

        for (int num : nums) q.add(num);

        while (maxOperations > 0) {
            int last = q.poll();
            q.add(last / 2);
            q.add(last / 2 + last % 2);
            maxOperations--;
        }
        return q.poll();
    }
}
