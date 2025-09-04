// Task 10: Multi-Dimensional Array (Matrix)
// Create a 2D array representing a 3×3 matrix.
// Input values and print:
// Sum of each row
// Sum of each column
// Diagonal sum
// Focus: nested loops, multidimensional arrays.
public class Task10 {
    public static void main(String[] args) {
        int num[][]= new int[3][3];  
         for (int i = 0; i < num.length; i++) {
              for (int j = 0; j < num.length; j++) {
                  System.out.print(num[i][j]);
              }
              System.out.println(" ");
         }      
    }
}
