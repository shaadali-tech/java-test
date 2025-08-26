import java.util.Scanner;



public class pro1 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int first=input.nextInt();
    int second=input.nextInt();

    int addition=first+second;
    int multplication=first*second;
    int division=first/second;
    int modulus=first%second;


    System.out.println(addition);
    System.out.println(multplication);
    System.out.println(division);
    System.out.println(modulus);
    
    input.close();
  }
}
