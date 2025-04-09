public class Ans3 {
    public static int[] runningSum(int[] nums) {
        for(int i = 1;i<nums.length;i++){
           nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4 };
        int[] result = runningSum(nums);

        // Print the result array using simple for loop
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
