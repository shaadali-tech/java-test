import java.util.Scanner;

public class pro20{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("enter a number:");
    int user=input.nextInt();
    fibonacci(user);

    

  }

  public static void fibonacci(int user){

    if (user<0) return;
    System.out.print("0");
    if(user==0) return;
    System.out.print("1");

    int first=0,second=1;
    while (first+second<=user) {
      int third=first+second;
      System.out.print(third+" ");
      first=second;
      second=third;
      
    }

    }
   
  }


