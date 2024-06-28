import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        System.out.println("  --------------------------------");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = sc.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            totalMarks += sc.nextInt();
        }

        double averagePercentage = (double) totalMarks / numberOfSubjects;

        char grade;
        if (averagePercentage >= 95) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 65) {
            grade = 'C';
        } else if (averagePercentage >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);

        System.out.println("  --------------------------------");
    }
}
