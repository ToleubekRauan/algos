package count_number_of_distinct_integers_after_reverse_operations;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int[] nums = {2,2,2};
        System.out.println(countDistinctIntegers(nums));
    }

    public static int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
            set.add(Integer.valueOf(new StringBuilder(String.valueOf(num)).reverse().toString()));
        }
        return set.size();
    }
}
