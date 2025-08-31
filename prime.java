import java.util.Scanner;
public class prime {
  public static void main(String[] args) {
    System.out.println("Welcome!");
    Scanner input=new Scanner(System.in);
    System.out.println("please enter a number: ");
    int num=input.nextInt();

    boolean isprime=false;
    
    for(int i=2;i<num;i++){
      if (num%i==0) {
        isprime=true;
      }
      
    }
  if (!isprime) {
      System.out.println("yes its a prime number ");
    }
  }
}
