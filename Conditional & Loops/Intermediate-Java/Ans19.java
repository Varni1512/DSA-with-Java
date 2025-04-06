public class Ans19 {
    public static void main(String[] args) {
        int a = 36, b = 60, hcf = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0)
                hcf = i;
        }
        System.out.println("HCF = " + hcf);
    }
}
