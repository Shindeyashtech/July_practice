 class Student{
    int roll;
    int mark;
    String name;

 }
public class AryObj{

    public static void main(String[] args) {
      
         Student s1=new Student();
         s1.name="y";
         s1.mark=44;
         
         Student s2=new Student();
         s2.name="ash";
         s2.mark=4;
         Student s3=new Student();
         s3.name="yash";
         s3.mark=44;

         Student stud[]=new Student[5];
     stud[0]=s1;
     stud[1]=s2;
     stud[2]=s3;
         for (int i = 0; i <stud.length; i++) {
            System.out.Println(stud[i]);
             
         }
    }
}
