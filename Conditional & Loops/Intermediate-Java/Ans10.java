public class Ans10 {
    public static void main(String[] args) {
        double[] grades = { 8.5, 9.0, 7.8 };
        double sum = 0;
        for (double g : grades)
            sum += g;
        double cgpa = sum / grades.length;
        System.out.println("CGPA = " + cgpa);
    }
}
