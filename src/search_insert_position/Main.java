package search_insert_position;

public class Main {

    public static void main(String[] args) {
        int target = 2;
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length;


        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }else if (nums[mid] > target) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return left;

    }
}
