public class Ans11 {
    public static void main(String[] args) {
        double principal = 10000, rate = 5, time = 3;
        double amount = principal * Math.pow((1 + rate / 100), time);
        double ci = amount - principal;
        System.out.println("Compound Interest = Rs. " + ci);
    }
}
