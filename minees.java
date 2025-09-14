import java.util.Scanner;

public class minees {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("welcome to Shaad Coding");
    int num1=input.nextInt();
    int num2=input.nextInt();
    minees find=new minees();
    int minimum=find.minimum(num1, num2);
    System.out.println(minimum);
  }

  public int minimum(int num1,int num2){
    if (num1<num2) {
      return num1;
    }
    return num2;
  }
}
