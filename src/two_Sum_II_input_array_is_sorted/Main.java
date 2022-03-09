package two_Sum_II_input_array_is_sorted;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];
        int left = 0, right = numbers.length - 1;

        while (left <= right) {
            if (numbers[left] + numbers[right] == target) {
                output[0] = left + 1;
                output[1] = right + 1;
                return output;
            }else if (numbers[left] + numbers[right] > target) {
                right--;
            }else {
                left++;
            }
        }


        return output;
    }
}
