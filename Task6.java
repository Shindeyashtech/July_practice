// Print numbers 1–50 using a for loop.

// Print even numbers 1–50 using a while loop.

// Print the multiplication table of any number using a do-while loop.


// Focus: difference between loop types.
class NumberPrint{
    public int i;
   public  int forLoop(){
        for ( i = 1; i <= 50; i++) {
            System.out.println(i);
        }
        return i;
    }
    public int WhileLoop(){
        i=1;
        while (i<=50) {
            if (i%2==0) {
                System.out.println(i);
            }
            i++;
        }
     return i; 
    }
}

public class Task6 {
    public static void main(String[] args) {
NumberPrint n1=new NumberPrint();
n1.forLoop();
n1.WhileLoop();
     }
}
