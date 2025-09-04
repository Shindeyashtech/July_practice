
import java.util.Scanner;

// Task 8: Methods & Method Overloading
// Write a class MathOps with methods:
// add(int, int)
// add(double, double)
// add(int, int, int)
// Call them from main and print results.
// Focus: methods, method overloading, reusability.
class MathOps{
     public int Add(int a,int b){
      System.out.println(a+b);
        return 0;
     }
     public int Add(double  a,double  b){
              System.out.println(a+b);

         return 0;
     }
     public int Add(int a,int b,int c){
              System.out.println(a+b+c);

        return 0;
     }
 
}

public class Task8 {
public static void main(String[] args) {

    MathOps m1=new MathOps();
Scanner sc = new Scanner(System.in);

System.out.println("Enter Number1");
int x=sc.nextInt();
System.out.println("Enter Number2");
int y =sc.nextInt();
System.out.println("Enter Number3");
int z=sc.nextInt();

      m1.Add(x, y);
    m1.Add(x, y);
    m1.Add(x, y, z);
    

}
    
}