import java.util.Scanner;

public class pro22 {
  public static void main(String[] args) {
    
    Scanner input=new Scanner(System.in);
    int num=input.nextInt();
    star(num);

  } 

  public static void star(int num){
   
    int rows=0;
    while(rows<num){
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
