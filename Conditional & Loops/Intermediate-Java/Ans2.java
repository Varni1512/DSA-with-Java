public class Ans2 {
    public static void main(String[] args) {
        int units = 250;
        double bill = 0;
        if (units <= 100)
            bill = units * 1.20;
        else if (units <= 300)
            bill = 100 * 1.20 + (units - 100) * 2.0;
        else
            bill = 100 * 1.20 + 200 * 2.0 + (units - 300) * 3.0;
        System.out.println("Electricity Bill = Rs. " + bill);
    }
}
