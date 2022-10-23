package reduction_operations_to_make;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {


    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,2,5,6};
        /*
        1,1,2,2,2,2,5,6
        1
        1,1,2,2,2,2,5,5
        3
        1,1,2,2,2,2,2,2
         */

        System.out.println(reductionOperations(nums));
    }

    static int reductionOperations(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        Arrays.sort(nums);

        if (nums[0] == nums[nums.length - 1]) {
            return 0;
        }
        // int max = 5
        // int next = 4
        //1 1 2 2 3
        // tmp 2

        int f = nums.length - 1;
        int s = f - 1;
        int cnt = 0;
        while (f > 0) {
            int tmp = s;
            while (nums[f] == nums[tmp]) tmp--;
            cnt += (s - tmp + cnt);
            f = tmp;
            s = f - 1;
            if (nums[f] == nums[0]) break;
        }

        return cnt;

    }
}
