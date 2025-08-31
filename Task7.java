
import java.util.Scanner;

// Task 7: Class & Object

// Create a class Student with variables name, age, and marks.

// In main, create 3 students and print their info.


// Focus: object creation, accessing fields.


class Student{
    public int age,marks;
    public String name;
Scanner sc=new Scanner(System.in);
    public Student() {
        System.out.println("Enter Student Detail");
        System.out.println("==================================");
        System.out.println("Enter The Name");
        name=sc.nextLine();
        System.out.println("Enter The Age");
        age=sc.nextInt();
        System.out.println("Enter The Marks");
        marks=sc.nextInt();
        sc.nextLine();
    }
    public void Display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(marks);

    }
    

}
public class Task7 { 

    public static void main(String[] args) {
        
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();


        System.out.println("Student 1");
        s1.Display();
        System.out.println("student 2");
        s2.Display();
        System.out.println("student 3");
        s3.Display();
         
    }



    
}
   