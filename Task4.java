
import java.util.Scanner;

public class Task4 {
 public static void main(String[] args) {
    int a;  //ikde kai chuklaa num int ghetlaa pn apla result tr String madhe hota
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    a=sc.nextInt();
    String num=(a>0)?
                (a%2==0 ? "positive & Even":"positive & Odd"):
                (a<0)?"negative":"Zero";
                  System.out.println("The Number is "+num);
 }   
}
 