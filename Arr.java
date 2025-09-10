public class Arr {
   public static void main(String[] args) {
    int a[][][]=new int[3][3][4];
    a[0][1][2]=4;
    a[1][1][2]=4;
    a[2][1][2]=4;
    for (int i = 0; i < a.length; i++) {

        for (int j = 0; j < a[i].length; j++) {
            for (int k = 0; k < a[i][j].length; k++) {
                
                System.out.print(a[i][j][k]);
            }
            System.out.println();
        }
        System.out.println();
    }
   } 
}
