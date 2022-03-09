package next_greated_element;

import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int[] array = {2, 5, -3, -4, 6, 7, 2};
        System.out.println(Arrays.toString(nextGreaterElement(array)));
    }

    private static int[] nextGreaterElement(int[] array) {
        int[] arr = new int[array.length];
        Arrays.fill(arr, -1);
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < array.length * 2; i++) {
            int idx = i % array.length;
            while (!stack.isEmpty() && array[idx] > array[stack.peek()]) {
                arr[stack.pop()] = array[idx];
            }
            stack.push(idx);
        }
        return arr;
    }
}
