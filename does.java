import java.util.Scanner;

public class does{
  public static void main(String[] args) {
    System.out.println("Welcome!");
    Scanner input=new Scanner(System.in);

    int age;
    do{
      System.out.println("please enter your age: ");
      age=input.nextInt();
    }
    while(age<0||age>100);
      System.out.println("your enterd age is: "+age);
    
  }
}
