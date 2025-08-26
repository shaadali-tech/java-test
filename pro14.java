import java.util.Scanner;


public class pro14 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int num=input.nextInt();
    long fact=factorial(num);
    System.out.println("factoral is:"+fact);

  }

  public static long factorial(int num){
    int i=1;
    long fact=1;
    while (i<=num) {
      fact*=i;
      i++;

      
    }
    return fact;
  }
}
