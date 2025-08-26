import java.util.Scanner;

public class ternary {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Welcome to Shaad Coding");
    System.out.println("Enter your First number: ");
    int num1=input.nextInt();
    System.out.println("enter your second number: ");
    int num2=input.nextInt();


    int greater_number=num1>num2? num1:num2;
    System.out.println("greter number is:"+greater_number);
  }
  
}
