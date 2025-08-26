import java.util.Scanner;

public class pro19 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=input.nextInt();
    int reverse=reverse(num);
    System.out.println("reversed number is:"+reverse);

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
