import java.util.Scanner;

public class recursion{
  public static void main(String[] args) {
    System.out.println("welcome to factorial pogram!");
    System.out.println("please enter a number :" );
    Scanner input=new Scanner(System.in);
    int num=input.nextInt();
    long result=recursions(num);
    System.out.println("factorial of a number is: "+result);
    long recursionadvanced=recursionadvanced(num);
    System.out.println(recursionadvanced);

  }

  public static long recursions(int num){
    long result=1;
    for(int i=1;i<=num;i++){
      result=result*i;

    }
    return result;
  }

  public static long recursionadvanced(int num){
    if (num==1){
      return 1;

    }
    return num*recursionadvanced(num-1);
  }
}