import java.util.Scanner;

public class Ans3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal : ");
        int P = sc.nextInt();
        System.out.print("Enter time : ");
        int T = sc.nextInt();
        System.out.print("Enter rate : ");
        int R = sc.nextInt();

        System.out.println("Simple Interest."+((P*R*T)/100));
    }
}
