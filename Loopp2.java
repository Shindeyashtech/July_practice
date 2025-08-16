public class Loopp2 {
    public static void main(String[] args) {
        System.out.println("squre Print * ");
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
               System.out.print("*");            
            }
            System.out.println();
            
         }
         
    }
}
// public class Main {
//     public static void main(String[] args) {
//         // Outer loop for number of rows
//         for (int i = 1; i<= 5; i++) {
//             // Inner loop for number of stars in each row
//             for (int j = 1; j  <= i; j++) {
//                 System.out.print("*");
//             }
//             // Move to the next line after printing stars in each row
//             System.out.println();
//         }
//     }
// }