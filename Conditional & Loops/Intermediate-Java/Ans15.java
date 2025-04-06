public class Ans15 {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }
    public static void main(String[] args) {
        int n = 5, r = 2;
        int ncr = factorial(n) / (factorial(r) * factorial(n - r));
        int npr = factorial(n) / factorial(n - r);
        System.out.println("nCr = " + ncr);
        System.out.println("nPr = " + npr);
    }
}
