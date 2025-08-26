import java.util.Scanner;



public class inside{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("please enter your name :");
    String name=input.nextLine();
    System.out.println("good morning "+ name);
    int age=input.nextInt();
    System.out.print("entered age is :"+age);
    input.close();
  }
}