
import java.util.Scanner;

public class pro4 {
  public static void main(String[] args) {
    System.out.println("Welcome to Shaad Coding");
    Scanner input=new Scanner(System.in);
    System.out.println("we are going to determine whether number is odd or even");
    int user=input.nextInt();
    if(user%2==0){
      System.out.println("number is even");
    }
    else{
      System.out.println("number is odd");
    }

    input.close();

  }

}
