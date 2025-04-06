public class Ans22 {
    public static void main(String[] args) {
        int num = 234;
        int sum = 0, product = 1;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        System.out.println("Result: " + (product - sum));
    }
}
