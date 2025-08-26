
import java.util.Scanner;



// Create a simple calculator that takes two numbers and prints results of: addition, subtraction, multiplication, division, and modulo.

// Add logical check: if num2 == 0, don’t divide.


// Focus: arithmetic + relational + logical operators.
class Opration{
    public int x,y;
    int addtion(){
        return x+y;
         }
    int subtraction(){
        return x-y;
         }
    int multiplication(){
        return x*y;
         }
         int division(){
        if (y==0){
            System.out.println();
            return 0;
        }
            return x/y;
         }
         int Module(){
        if (y==0){
            System.out.println();
            return 0;
        }
            return x%y;
         }
}
public class Task2 {
public static void main(String[] args) {
    int a,b,result;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number 1");
    a=sc.nextInt();
    System.out.println("Enter the number 2");
    b=sc.nextInt();
    Opration o1=new Opration();
    o1.x=a;
    o1.y=b;
   
    System.out.println( "Addtion of two number is "+ o1.addtion());
    System.out.println( "Addtion of two number is "+ o1.subtraction());
    System.out.println( "Addtion of two number is "+ o1.multiplication());
    System.out.println( "Addtion of two number is "+ o1.division());
    System.out.println( "Addtion of two number is "+ o1.Module());


}
    
}
