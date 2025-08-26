import java.util.Scanner;




public class swap {
  public static void main(String[] args) {
    System.out.println("Welcome to Shaad Coding");
    Scanner input=new Scanner(System.in);
    int first=input.nextInt();
    int second=input.nextInt();
    int third=first;
    first=second;
    second=third;
    System.out.println("first="+first);
    System.out.println("second="+second);
    input.close();
  }
}
