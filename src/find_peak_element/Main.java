package find_peak_element;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};

        System.out.println(findPeakElement(arr));
    }


    public static int findPeakElement(int[] nums) {

        if (nums.length == 1) return 0;

        if (nums.length == 2) {
            if (nums[0] > nums[1]) {
                return 0;
            }else {
                return 1;
            }
        }
        int left = 0, right = nums.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums.length > mid + 1 && (mid - 1) > 0 && nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] < nums[mid - 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return Math.min(left, right);

    }
}
