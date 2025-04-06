public class Ans18 {
    public static void main(String[] args) {
        double amount = 10000, rate = 5.5, years = 10;
        double futureValue = amount * Math.pow((1 + rate / 100), years);
        System.out.println("Future Investment Value: Rs. " + futureValue);
    }
}
