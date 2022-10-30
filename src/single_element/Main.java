package single_element;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int[] nums2 = {1,1,2,3,3,4,4,8,8};
        int[] nums3 = {1,3,3,7,7,11,11};
        int[] nums = {1,1,2,2,3};


        int ans = 0;
        for (int num : nums2) {
            ans ^= num;
        }
        System.out.println(ans);
        //System.out.println(singleNonDuplicate(nums));
    }



    static int singleNonDuplicate(int[] nums) {
        //1,1,2,3,3,4,4,8,8
        //3,3,7,7,10,11,11
        //2,2,3,3,4,4,8,8,9
        /*
        [1,1,2,3`,3,4,4,8,8]
        mid = 4
        l = 0
        r = 3
        */
        int left = 0, right = nums.length-1;
        while(left < right){
            int mid = (left + right)/2;
            if( (mid % 2 == 0 && nums[mid] == nums[mid +1]) || (mid %2 == 1 && nums[mid] == nums[mid - 1]) )
                left = mid + 1;
            else
                right = mid;
        }
        return nums[left];
    }


    static int test(int[] nums) {
        int left = 0, right = nums.length-1;
        while(left < right){
            int mid = (left + right)/2;
            if( (mid % 2 == 0 && nums[mid] == nums[mid +1]) || (mid %2 == 1 && nums[mid] == nums[mid - 1]) )
                left = mid + 1;
            else
                right = mid;
        }
        return nums[left];
    }
}
