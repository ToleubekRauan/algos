package coworkers;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int s1,s2,s3;
        int[] arr = new int[3];


        s1 = scanner.nextInt();
        s2 = scanner.nextInt();
        s3 = scanner.nextInt();
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        Arrays.sort(arr);



        int delta1 = arr[2] - arr[0];
        int delta2 = arr[2] - arr[1];

        while (delta1 != 0) {
            if (delta1 >= 5) {
                delta1 -= 5;
            }else {
                delta1 -= 1;
            }
            count++;
        }

        while (delta2 != 0) {
            if (delta2 >= 5) {
                delta2 -= 5;
            }else {
                delta2 -= 1;
            }
            count++;
        }

        /*
        19 30 10

        10 18 30

        delta 20 12

        20

        1 2 5

        7 7 7

         */


        System.out.println(count);

    }
}
