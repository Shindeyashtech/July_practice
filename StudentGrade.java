
import java.util.Scanner;

// Project Idea: Student Grades Management System (Mini)
// Features to build:
// Calculate total, average, highest, and lowest marks for each student (use loops).
// Calculate total, average, highest, and lowest for each subject (row vs column logic).
// Display grades based on average (A, B, C, D, F) using if-else / ternary operators.
// Use methods:
// inputMarks() → fills the array
// calculateStudentStats() → total, average, grade per student
// calculateSubjectStats() → total, average, highest, lowest per subject
// printMatrix() → prints marks
// Optional: Use method overloading for calculating sum of 2 or 3 students, just for practice.

public class StudentGrade {
    public static void main(String[] args) {
        
        // Input marks of n students for 3 subjects (use 2D array).
        Scanner sc=new Scanner(System.in);
System.out.print("Enter No Student " );
        int stud = 0;
        stud=sc.nextInt();
        int student[][]=new int[stud][3];
        


        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j <student[i].length; j++) {
 System.out.print("Enter marks for Student " + (i+1) + " Subject " + (j+1) + ": ");
student[i][j] = sc.nextInt();
                
            }
            System.out.println();
        }
        
        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j <student[i].length; j++) {
                System.out.print(student[i][j]+" ");
                
            }
            System.out.println();
        }

    }
}
