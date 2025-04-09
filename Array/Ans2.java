public class Ans2 {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i]; // First copy
            ans[n + i] = nums[i]; // Second copy
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int[] result = getConcatenation(nums);

        // Print the result array using simple for loop
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
