
import java.util.Scanner;

// Task 1: Variables & Data Types
// Build a program that stores your name, age, weight, and height.
// Print them in one sentence: “My name is ___, I am ___ years old, weigh ___ kg, and my height is ___ cm.”
// Focus: correct data types (String, int, double), concatenation.
public class Task{
    public static void main (String args[]){
        System.out.println("“My name is ___, I am ___ years old, weigh ___ kg, and my height is ___ cm.”");
        String name ;
        int age;
        Double weight;
        Float height;
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Name");
        name =sc.nextLine();
        System.out.println("Enter Your Age");
        age=sc.nextInt();
        System.out.println("Enter the weight");
        weight=sc.nextDouble();
        System.out.println("Enter Your Hight");
        height=sc.nextFloat();
        System.out.println("“My name is"+name+",I am"+age+"years old, weigh"+weight+"kg,and my height is"+height+"cm.”");
    }
}