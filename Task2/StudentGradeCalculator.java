import java.util.*;

public class StudentGradeCalculator {

    public static double Total(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double AverageMarks(double total, int a) {
        return total / a;
    }

    public static String Grades(double avg) {
        if (avg >= 90) {
            return "A";
        }
        else if (avg >= 80) {
            return "B";
        }
        else if (avg >= 70) {
            return "C";
        }
        else if (avg >= 60) {
            return "D";
        }
        else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter how many subject you have: ");
        int sub = num.nextInt();
        System.out.println();

        double[] marks = new double[sub];

        for (int i = 0; i < sub; i++) {
            Scanner mark = new Scanner(System.in);
            System.out.print("Enter marks of subject number " + (i+1) + " out of 100: ");
            marks[i] = mark.nextDouble();
        }

        double totalMarks = Total(marks);
        double averageMarks = AverageMarks(totalMarks, sub);
        String grade = Grades(averageMarks);

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("\nAverage Marks Percentage: " + averageMarks + "%");
        
        if (grade == "Fail") {
            System.out.println("\nSorry, You Fail");
        } 
        else {
            System.out.println("\nOverall Grades: " + grade);
        }

    }
}