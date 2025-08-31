import java.util.Scanner;

public class sumpositive {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("welcome!");
    System.out.println("please enter how many numbers you want to enter: ");

    int size=input.nextInt();
    int sum=0;
    for(int i=0;i<size;i++){
      System.out.println("please enter your "+(i+1)+"element");
      int num=input.nextInt();
      if (num<0) {
        continue;
      }

      sum+=num;
  }

  System.out.println("sum of all the positive numbers are:"+sum);
}

}