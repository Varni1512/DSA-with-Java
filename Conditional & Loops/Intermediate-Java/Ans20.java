public class Ans20 {
    public static void main(String[] args) {
        int a = 12, b = 15;
        int max = Math.max(a, b);
        while (true) {
            if (max % a == 0 && max % b == 0) {
                System.out.println("LCM = " + max);
                break;
            }
            max++;
        }
    }
}
