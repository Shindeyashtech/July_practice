

class Feature  {

    public void cam(){
        System.out.println("Cam is Working");
    }
    public int price(String Discount){
        
        if (Discount != null) {
          return 950;  
        }
     return 1000;
    }

}

public class Meth {
     //Mobile
     public static void main(String[] args) {
         Feature f1=new Feature();
         f1.cam();
        //  Scanner sc = new Scanner(System.in);
         int FinalPrice =f1.price("yes"); 
         System.out.println(FinalPrice);


     }
}
