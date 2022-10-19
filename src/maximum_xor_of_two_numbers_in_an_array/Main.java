package maximum_xor_of_two_numbers_in_an_array;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        int[] arr = {3,10,5,25,2,8};
        System.out.println(findMaximumXOR(arr));
    }


    public static int findMaximumXOR(int[] nums) {
       //91 36
        for (int num : nums) {
            System.out.println(Integer.bitCount(num) + ", num = " + num);
        }
        int minKey = Integer.MAX_VALUE;
        int maxKey = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int key = Integer.bitCount(num);
            if (minKey > key) {
                minKey = key;
                Integer val = map.get(minKey);
                if (val == null) {
                    map.put(minKey, num);
                }else {
                    if (val > num) {
                        map.put(minKey, num);
                    }
                }
            }
            if (maxKey < key) {
                maxKey = key;
                Integer val = map.get(minKey);
                if (val == null) {
                    map.put(minKey, num);
                }else {
                    if (val < num) {
                        map.put(minKey, num);
                    }
                }
            }
        }
        System.out.println(map);


        int res = 0;
        for (int num : map.values()) {
            res ^= num;
        }
       return res;
    }


    public static int findMaximumXOR2(int[] nums) {
        throw new RuntimeException("");
    }
}



