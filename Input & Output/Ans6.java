import java.util.Scanner;

public class Ans6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Currency in ruppes: ");
        int cur = sc.nextInt();
        System.out.println(cur +" Indian Rupee equals " + (cur * 0.012) + " US Dollar");
    }
}
