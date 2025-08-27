
import java.util.Scanner;

class Week{
     
    public Week(int Day) {
        //  case 1 -> System.out.println("Monday");
        //     default -> {
        switch (Day) {
            case 1:
            System.out.println("Monday");
            case 2 :
            System.out.println("Tuesday");
            case 3 :
            System.out.println("Wednesday");
             break;
            case 4 :
            System.out.println("Thursday");
             break;
            case 5 :
            System.out.println("Friday");
             break;
            case 6 :
            System.out.println("Saturday");
             break;
            case 7 :
            System.out.println("Sunday");
             break;
            default:
            System.out.println("invalid input");
            break;
        }
    }
     
}
public class Task5 {
    public static void main(String[] args) {
        System.out.println("Hey!! Welcome");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Day");
        int a=sc.nextInt();
        Week w1=new Week(a);

    }
}
