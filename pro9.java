public class pro9 {
  public static void main(String[] args) {
    shaadu();
    
  }

  public static void shaadu(){
    System.out.println("Hello java From Shaad");
    int rows=0;
    while(rows<5){
      System.out.print("*");
      int i=0;
      while (i<rows) {
        System.out.print(" *");
        i++;
      }
      System.out.println();

      rows++;
    }
  }
}
