package rotate_array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {-1,-100,3,99};
        int k = 2;
        System.out.println(Arrays.toString(arr));
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] nums, int k) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        int mod = k % nums.length;
        for (int i = nums.length - 1; i >= mod; i--) {
            nums[i] = nums[i - mod];
        }
        for (int i = 0; i < mod; i++) {
            nums[i] = copy[copy.length - mod + i];
        }

    }
}
