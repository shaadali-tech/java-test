import java.util.Scanner;

public class pro13 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int number=input.nextInt();
    int sum=oddsum(number);
    System.out.println("odd number sum is:"+sum);
}

public static int oddsum(int number){
  int sum=0;
  int i=1;
  while(i<=number){
    sum+=i;
    i+=2;


  }

  return sum;

   }
}
