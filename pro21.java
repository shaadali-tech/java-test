import java.util.Scanner;

public class pro21 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=input.nextInt();
    int reverse=reverse(num);
    System.out.println("reversed number is:"+reverse);
    if (reverse==num){
      System.out.println("number is palindrome");
    }
    else{
      System.out.println("number is not palindrome");
    }

  }

  public static int reverse(int num){
    int newnum=0;    
    while (num>0) {
      int digit=num%10;
      newnum=newnum*10+digit;
      num=num/10;
    }
    return newnum;
  }
}
