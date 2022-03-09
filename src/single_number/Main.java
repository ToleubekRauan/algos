package single_number;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,2,2,1};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        int single = 0;

        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
