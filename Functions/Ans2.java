package Functions;

import java.util.Scanner;

public class Ans2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        oddeven(number);
    }

    public static void oddeven(int number){
        if(number % 2 == 0){
            System.out.println("Even function");
        } else {
            System.out.println("odd function");
        }
    }
}
