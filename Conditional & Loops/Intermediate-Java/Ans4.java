public class Ans4 {
    public static void main(String[] args) {
        double price = 1000, discount = 15;
        double finalPrice = price - (price * discount / 100);
        System.out.println("Price after discount = Rs. " + finalPrice);
    }
}
