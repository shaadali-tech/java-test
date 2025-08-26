import java.util.Scanner;

public class password {
  public static void main(String[] args) {
    System.out.println("welcome to Shaad coding!");
    Scanner input=new Scanner(System.in);
    int password=7986;
    int checker;


    
    do{
      System.out.println("please enter the password to check: ");
      checker=input.nextInt();

    }
    while(password!=checker);
    System.out.println("Congratulations");
  }
}
