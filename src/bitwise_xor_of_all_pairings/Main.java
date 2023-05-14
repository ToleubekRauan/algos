package bitwise_xor_of_all_pairings;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = {2,1,3};
        int[] nums2 = {10,2,5,0};
        System.out.println(xorAllNums(nums1, nums2));

    }

    private static int xorAllNums(int[] nums1, int[] nums2) {
//        int xor = 0;
//        int len1 = nums1.length;
//        int len2 = nums2.length;
//        List<Integer> list = new ArrayList<>();
//        for (int num1 : nums1) {
//            if (len2 % 2 == 0) {
//                list.add(0);
//            }else {
//                list.add(num1);
//            }
//        }
//        for (int num2 : nums2) {
//            if (len1 % 2 == 0) {
//                list.add(0);
//            }else {
//                list.add(num2);
//            }
//        }
//        for (int num : list) {
//            xor ^= num;
//        }
//
//        return xor;
        int n1 = 0, n2 = 0;

        for (int num : nums1) {
            n1 ^= num;
        }

        for (int num : nums2) {
            n2 ^= num;
        }
        return (nums2.length % 2 * n1) ^ (nums1.length % 2 * n2);

    }
}
