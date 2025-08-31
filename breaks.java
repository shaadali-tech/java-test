
import java.util.Scanner;
public class breaks {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("welcome to Shaad Coding");
    String loop;

    for(int i=0;i<=100;i++){
      loop=input.next();
      if (loop.equals("exit")) {
        break;
      }
    }
  }
}
