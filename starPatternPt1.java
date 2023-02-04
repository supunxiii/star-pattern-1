public class starPatternPt1{
  public static void main(String[] args){
    int x;
    int y;
    for( x = 1; x < 7 ; x++){
      for( y = 1; y < x; y++){
        System.out.print("*");
      }
      System.out.println("*");
    }
  }
}
