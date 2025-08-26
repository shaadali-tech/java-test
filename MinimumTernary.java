import java.util.Scanner;;

public class MinimumTernary {
  public static void main(String[] args) {
    System.out.println("welcome!");
    Scanner input=new Scanner(System.in);
    System.out.println("please enter your first number:");
    int num1=input.nextInt();
    System.out.println("please enter your second number:");
    int num2=input.nextInt();
    MinimumTernary ternary=new MinimumTernary();
    int num=ternary.min(num1, num2);
    System.out.println("minimum number is: "+num);
    System.out.println("please enter the marks of student:");
    int marks=input.nextInt();
    String result=marks>80?"high":(marks>50?"medium":"low");
    System.out.println("your result is: "+result);



  }

  public int min(int num1,int num2){
  
    return num1>num2?num2:num1;
  }

}
