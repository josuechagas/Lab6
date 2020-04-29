import java.util.Scanner;
public class LandTract{
   
   private int length;
   private int width;
  
   public int area() {
         int x;
         x =  length * width;
         return x;
   }
  
   public boolean equals(LandTract L1 ) {
        if ((this.length == L1.length) && (this.width == L1.width)||(this.length == L1.width) && (this.width == L1.length)) return true;
        return false;
   }
  
   public String toString(){
        return " LandTract object with length " + length + " and width " + width;
   }
  
   public LandTract(int X, int Y) {
      this.length = X;
      this.width = Y;
   }
  
   public static void main(String []args) {
   int x, y;
   boolean z;
   int FirstArea, SecondArea;
    
        Scanner scan = new Scanner(System.in);
      
        System.out.println("Provide the dimensions for tracts of land. ");
        System.out.print("Tract #1 length: ");
        x = scan.nextInt();
        System.out.print("Tract #1 width: ");
        y = scan.nextInt();
        LandTract first = new LandTract(x,y);
    
       System.out.print("Tract #2 length: ");
        x = scan.nextInt();
        System.out.print("Tract #2 width: ");
        y = scan.nextInt();
        LandTract second = new LandTract(x,y);

      scan.close();
    
      FirstArea = first.area();
      SecondArea = second.area();
      System.out.println(" The area of the first tract is " +FirstArea );
      System.out.println(" The area of the second tract is " +SecondArea );
    
      System.out.println(first.toString());
      System.out.println(second.toString());
  
      z  = first.equals(second);
      if (z == true)
         System.out.println(" The two tracts have the same size." );
      else
         System.out.println(" The two tracts do not have the same size." );
      
   }
}
