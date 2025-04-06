public class Ans3 {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50 };
        int sum = 0;
        for (int num : nums){
            sum += num;
        }
        double avg = (double) sum / nums.length;
        System.out.println("Average = " + avg);
    }
}
