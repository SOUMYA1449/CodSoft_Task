import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double[] marks = new double[numSubjects];
        double totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextDouble();

            // Validate the input to ensure it's between 0 and 100
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid input. Enter marks between 0 and 100 for subject " + (i + 1) + ": ");
                marks[i] = scanner.nextDouble();
            }

            totalMarks += marks[i];
        }

        double averageMarks = totalMarks / numSubjects;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

        scanner.close();
    }
}
