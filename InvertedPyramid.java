public class InvertedPyramid {

    public static void main(String[] args) {
        System.out.println("Invertd Star pyramid");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}