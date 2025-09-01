import java.util.Scanner;

public class oddnumbers {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("hello Sablog");
    System.out.println("please enter a number");
    int num=input.nextInt();
    int sum=oddsum(num);
    System.out.println("here is the sum of all odd number: "+sum);

  }

  public static int oddsum(int num){
    int i=1;
    int sum=0;
    while (i<=num) {
      if (i%2!=0) {
        sum+=i;
        
      }
      i++;
      
    }
    
    
    
    return sum;


  }
}
