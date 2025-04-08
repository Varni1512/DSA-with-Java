package Functions;

import java.util.Scanner;

public class Ans8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number of Subjects:");
        int count = scanner.nextInt();

        float totalMarks = getTotalMarks(scanner, count);
        float percentage = calculatePercentage(totalMarks, count);
        String grade = getGrade(percentage);

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    // Function to read marks and calculate total
    public static float getTotalMarks(Scanner scanner, int count) {
        float total = 0;
        System.out.println("Enter Marks of " + count + " Subjects:");
        for (int i = 0; i < count; i++) {
            total += scanner.nextInt();
        }
        return total;
    }

    // Function to calculate percentage
    public static float calculatePercentage(float totalMarks, int count) {
        return (totalMarks / (count * 100)) * 100;
    }

    // Function to determine grade based on percentage
    public static String getGrade(float percentage) {
        switch ((int) percentage / 10) {
            case 9:
                return "A+";
            case 8:
            case 7:
                return "A";
            case 6:
                return "B";
            case 5:
                return "C";
            default:
                return "D";
        }
    }
}
