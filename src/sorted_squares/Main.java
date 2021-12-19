package sorted_squares;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-3,-2,-1};
        System.out.println(Arrays.toString(sortedSquaredArray(arr)));
    }

    public static int[] sortedSquaredArray(int[] array) {
        int[] arr = new int[array.length];
        int left = 0, right = array.length - 1;
        int index = array.length - 1;
        while (left <= right) {
            if (Math.abs(array[right]) > Math.abs(array[left])) {
                arr[index--] = array[right] * array[right];
                right--;
            }else {
                arr[index--] = array[left] * array[left];
                left++;
            }
        }
        return arr;
    }
}
