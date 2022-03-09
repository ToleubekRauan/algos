package flood_fill;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] arr = {{0,0,0},{0,1,1}};
        int sc = 1;
        int sr = 1;
        int newColor = 1;
        System.out.println(Arrays.deepToString(floodFill(arr, sr, sc, newColor)));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (oldColor == newColor) {
            return image;
        }
        helper(image, sr, sc, newColor, oldColor);
        return image;
    }


    static void helper(int[][] image, int sr, int sc, int newColor, int oldColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != oldColor) {
            return;
        }
        image[sr][sc] = newColor;
        helper(image, sr + 1, sc, newColor, oldColor);
        helper(image, sr - 1, sc, newColor, oldColor);
        helper(image, sr, sc + 1, newColor, oldColor);
        helper(image, sr, sc - 1, newColor, oldColor);


    }
}
