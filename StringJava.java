
import java.util.Scanner;

public class StringJava {
    public static void main(String[] args) {
        String nme="yash";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String name = new String(sc.nextLine());
        // System.out.println(name);
        // System.out.println(name.concat("one key"));
            for (int i = 0; i <name.length(); i++) {
            System.out.println(name.charAt(i));
            
        }
        for(int i=name.length()-1;i>=0;i--){
            System.out.println(name.charAt(i));

        }
        
    }
    
}
