public class Ans12 {
    public static void main(String[] args) {
        int[] marks = { 78, 85, 90, 88, 76 };
        int sum = 0;
        for (int mark : marks)
            sum += mark;
        double avg = (double) sum / marks.length;
        System.out.println("Average Marks = " + avg);
    }
}
