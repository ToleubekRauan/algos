package search_a_2d_matrix;

public class Main {

    public static void main(String[] args) {
        int[][] arr2 = {
                {1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}
        };
        int target2 = 5;

        int[][] arr = {
                {1,1}
        };
        int target = 0;
        System.out.println(searchMatrix(arr, target));
    }


    static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length / 2;
        int m = matrix[0].length / 2;


        int[] h = matrix[m];
        int s = 0, e = h.length - 1;

        while (s <= e) {
            int mid = (s + e) / 2;
            if (h[mid] == target) {
                return true;
            } else if (h[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        if (matrix.length <= s) {
            return false;
        }

        int[] v = matrix[s];
        int s2 = 0, e2 = v.length - 1;

        while (s2 <= e2) {
            int mid = (s2 + e2) / 2;
            if (v[mid] == target) {
                return true;
            } else if (v[mid] > target) {
                e2 = mid - 1;
            } else {
                s2 = mid + 1;
            }
        }


        return false;
    }


}
