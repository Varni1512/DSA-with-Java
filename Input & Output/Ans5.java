import java.util.Scanner;

public class Ans5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("Num1 is large");
        }else if(num1 == num2){
            System.out.println("Num1 and Num2 is Same");
        } else {
            System.out.println("Num2 is large");
        }
    }
}
