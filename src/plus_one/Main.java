//package plus_one;
//
//import java.util.Arrays;
//import java.util.stream.Stream;
//
//public class Main {
//
//    public static void main(String[] args) {
//        int[] arr = new int[] {1,7,3,6,5,6};
//
//        int sum = Arrays.stream(arr).sum();
//
//        int lsum = 0;
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            lsum += arr[i+1];
//            if ((sum - lsum) / 2 == arr[i]) {
//                return true;
//            }
//        }
//
//
//
//
//    }
//}
