package permutations;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(permute(arr));
    }

    public static List<List<Integer>> permute(int[] nums) {
        return null;
    }

    private void helper(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            List<Integer> in = new ArrayList<>();
            in.add(nums[i]);
        }
    }
}
