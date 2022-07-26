package three_number_sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 1, 2};
        int[] order = {1, 2, 0};
        System.out.println(Arrays.toString(threeNumberSort(arr, order)));
    }

    public static int[] threeNumberSort(int[] array, int[] order) {
		/*
		1 0 0 -1 -1 0 1 1
		0 1 0 -1 -1 0 1 1
		0 0 1 -1 -1 0 1 1
		0 0 1 1 -1 0 1 -1
		0 0 1 1 1 0 -1 -1
		0 0 0 1 1 1 -1 -1
		*/
        int firstIndex = 0, lastIndex = array.length - 1;
        int start = 0;
        while (start < lastIndex) {
            if (array[start] == order[0]) {

                swap(array, firstIndex, start);

                if (array[firstIndex] == order[0] && start == firstIndex) {
                    firstIndex++;
                    start++;
                }else {
                    firstIndex++;
                }
            } else if (array[start] == order[2]) {

                while (array[lastIndex] == order[2]) lastIndex--;

                swap(array, lastIndex, start);

                if (array[lastIndex] == order[0] && start == firstIndex) {
                    firstIndex++;
                    start++;
                }else {
                    lastIndex--;
                }
            }else {
                start++;
            }

        }

        return array;
    }

    private static void swap(int[] array, int firstIndex, int start) {
        int tmp = array[firstIndex];
        array[firstIndex] = array[start];
        array[start] = tmp;
    }
}
