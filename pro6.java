import java.util.Scanner;


public class pro6 {
  public static void main(String[] args) {
    System.out.println("welcome to Shaad coding");
    Scanner input=new Scanner(System.in);
    System.out.println("please enter a year");
    int year=input.nextInt();

    if (year%4==0){
      if (year%100==0){
        if (year%400==0) {
            System.out.println("year is a leap year");
          }
         
            
          }
          else{
            System.out.println("year is not a leap year");
          }

               {
                System.out.println("year is a leap year");
        
      }
    }

    input.close();
  }
}
