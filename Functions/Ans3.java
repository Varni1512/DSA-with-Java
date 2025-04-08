package Functions;

import java.util.Scanner;

public class Ans3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        vote(age);
    }

    public static void vote(int age){
        if(age >= 18){
            System.out.println("Eligible for vote");
        } else {
            System.out.println("Not Eligible for vote");
        }
    }
}
