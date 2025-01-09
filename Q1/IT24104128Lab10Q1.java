import java.util.Scanner;

public class IT24104128Lab10Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the mark
        System.out.print("Enter the mark (0 to 100): ");
        int mark = scanner.nextInt();

// asserted or Mark testing
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";
        System.out.println("Mark is Validated!");

        // Find the grade
        char grade;
if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
}

        // Validate the grade using assertions
        assert (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') 
            : "Incorrect Grade Assigned";
// Print the grade
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
