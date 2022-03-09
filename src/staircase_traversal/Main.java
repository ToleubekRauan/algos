package staircase_traversal;

import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        int height = 6, maxSteps = 1;
        System.out.println(staircaseTraversal(height, maxSteps));
    }

    public static int staircaseTraversal(int height, int maxSteps) {
        int[] arr = new int[height];
        generateArray(arr, 0, height, maxSteps);
        System.out.println(Arrays.toString(arr));
        int value = 0;
        int minValue = height - maxSteps;
        int maxValue = height - 1;
        while (maxValue >= minValue) {
            value += arr[maxValue--];
        }
        return value;
    }
    private static void generateArray(int[] arr, int start, int end, int steps) {
        if (start >= end) return;
        if (start == 0 || start == 1) {
            arr[start] = 1;
        }else {
            int idx = 0;
            while (idx < start) {
               // arr[start] += arr[idx];
                idx++;
            }
        }
        generateArray(arr, start + 1, end, steps);

    }

}