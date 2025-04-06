public class Ans8 {
    public static void main(String[] args) {
        double cost = 20000, rate = 10, years = 3;
        double value = cost * Math.pow((1 - rate / 100), years);
        System.out.println("Value after depreciation = Rs. " + value);
    }
}
