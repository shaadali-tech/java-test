import java.util.Scanner;
public class fibonaaci {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("welcome to shaad coding");
    System.out.println("enter the elements you want to ne printed");
    int count=input.nextInt();
    for(int i=1;i<=count;i++){
      System.out.print(fibonacciseries(i)+" ");
    }
  }

  public static int fibonacciseries(int position){
    if (position==1) {
      return 0;
    }
    if (position==2){
      return 1;
    }

    return fibonacciseries(position-1)+
    fibonacciseries(position-2); 
  }
}
