package move_zeros;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 0};
        System.out.println(Arrays.toString(arr));
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroes(int[] nums) {
        int lastZero = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastZero] = nums[i];
                lastZero += 1;
            }
        }
        while (lastZero < nums.length) {
            nums[lastZero++] = 0;
        }
    }
}
