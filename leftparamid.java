import java.util.Scanner;

public class leftparamid {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("please enter a number:");
    int num =input.nextInt();
   // printrightpattern(num);
    printreversepattern(num);
  }

//testing
   public static void printreversepattern(int num){
    int rows=num;
    while (rows>0) {
      System.out.print("*");
      int i=1;
      while (i<rows) {
        System.out.print("*");
        i++;
      }
      System.out.println();
      rows--;
    }
   }








  public static void printrightpattern(int num){
    int rows=0;
    while (rows<num) {
      System.out.print("*");
      int i=0;
      while (i<rows) {
        System.out.print("*");
        i++;
      }
      System.out.println();
      rows++;
      
    }
  }

}
