import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
         String aar[]={"Even","Odd"};
        System.out.println(aar[a%2]);
    }
}