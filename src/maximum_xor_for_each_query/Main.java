package maximum_xor_for_each_query;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {0,1,1,3};
        int maxBit = 2;
        System.out.println(Arrays.toString(getMaximumXor(nums, maxBit)));
    }

    public static int[] getMaximumXor(int[] nums, int maximumBit) {
        int max = (int)(Math.pow(2, maximumBit)) - 1;
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int tmp = 0;
            for (int j = 0; j < nums.length - i - 1; j++) {
                tmp = nums[j] ^ nums[j + 1];
                nums[j] = tmp;
            }
            tmp ^= 0;
            arr[i] = tmp;
        }


        return arr;

    }
}
