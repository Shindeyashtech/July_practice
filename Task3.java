
import java.util.Scanner;

// Task 3: If-Else Ladder

// Input a number and print whether it’s positive, negative, or zero.

// Extend: If it’s positive, check if it’s even or odd.

// Focus: nesting if-else, logic branching.
class CheckNum{

    public CheckNum(int num) {
        if (num<0){
                    System.out.println("negtive");

        }
        else if (num>0){
             System.out.println("postive");

            if (num % 2 == 0 ) {
                System.out.println("Number is Even");
            } else {
                System.out.println("Number is ood");
            }
        }
       
        else
        System.out.println("Number is Zero");      
        }
    }
    // class CheckEvenOdd{
    //     public int number;
    //    public int EvenOdd()
    //    {
    //         if (number % 2 == 0 && number>0) {
    //             System.out.println("Number is Even");
    //         } else {
    //             System.out.println("Number is ood");
    //         }



    //       return 0;  
    //     };
    // }

public class Task3 {
    public static void main(String[] args) {
        int num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        num1=sc.nextInt();
        CheckNum c1=new CheckNum(num1);
        // CheckEvenOdd c2=new CheckEvenOdd();
        // num1=c2.number;
        // c2.EvenOdd();
        
    }
    
}
