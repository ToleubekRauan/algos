package xor_queries;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {16};
        int[][] queries = {{0,0},{0,0},{0,0}};
        System.out.println(Arrays.toString(xorQueries(arr, queries)));
    }

    public static int[] xorQueries(int[] arr, int[][] queries) {
        int[] a = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            int answer = 0;
            for (int j = left; j <= right; j++) {
                answer ^= arr[j];
            }
            a[i] = answer;
        }


        return a;
    }
}
