
import java.io.*;
public class Scan {
 
    public static void main(String arg[]) {
        int x, y;
        System.out.println("Addtion Of The Two Number With Two Input Method");
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Two Number");
        try {
            x = Integer.parseInt(b.readLine());
            y = Integer.parseInt(b.readLine());
            System.out.println(x + y);
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
            return;
        }
        int a = Integer.parseInt(arg[0]);
        int d = Integer.parseInt(arg[0]);
        int sum1 = a + d;
        System.out.println(sum1);

    }
 }