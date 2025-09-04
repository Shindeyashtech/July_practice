
import java.util.Scanner;

// Task 9: Arrays & Loops

// Input marks of 5 students into an array.

// Print total, average, highest, and lowest marks.

// Focus: arrays + loops + basic aggregation logic.
public class Task9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int student[]=new int[5];
        for (int i = 0; i < 5; i++) {          
            System.out.println("Enter Your Marks "+(i+1)+" :");
            student[i]=sc.nextInt(); }
        for (int i = 0; i < 5; i++) {
            System.out.println("Student "+(i+1)+" Marks :"+student[i]);}
            int total=student[0];
            int highest=student[0];
            int lowest=student[0];

            for (int i = 0; i < 5; i++) {
                total+=student[i];
                if (student[i]>highest) {
                    highest=student[i];
                }
                if (student[i]> lowest) {
                    lowest=student[i];
                }
            }
            int avg = total/5;
            System.out.println( "Total :"+ total);
            System.out.println( "highest :" +highest);
            System.out.println( "lowest :" + lowest);
            System.out.println("average :"+avg);

     }
    
}
