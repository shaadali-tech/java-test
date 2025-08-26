import java.util.Scanner;

public class pro10 {
  public static void main(String[] args) {
    System.out.println("Welcome to Shaad Coding");
    int first=numbers();
    int second=numbers();
    int sum=first+second;
    System.out.println(sum);

  }

  public static int numbers(){
    System.out.println("please enter a number");
    Scanner input=new Scanner(System.in);
    int number=input.nextInt();
    return number;
  }

 

}
