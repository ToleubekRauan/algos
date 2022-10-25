package diagonal_traverse;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int[][] arr2 = {
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };
        int[][] arr = {
                {2,5,8}, {4,0,-1}
        };
        System.out.println(Arrays.toString(findDiagonalOrder(arr)));
    }

    static int[] findDiagonalOrder(int[][] mat) {
        int len = mat.length * mat[0].length;
        int[] arr = new int[mat.length * mat[0].length];
        int idx = 0;
        int x = 0, y = 0;
        boolean up = true;
        while (idx < len) {
            arr[idx++] = mat[x][y];
            if (up) {
                x--;
                y++;
            } else {
                x++;
                y--;
            }
            if (y > mat[0].length - 1) {
                y = mat[0].length - 1;
                x += 2;
                up = false;
            }else if (x > mat.length - 1) {
                x = mat.length - 1;
                y += 2;
                up = true;
            }else if (x < 0) {
                x = 0;
                up = false;
            } else if (y < 0) {
                y = 0;
                up = true;
            }
        }
        return arr;
    }
}
