import java.util.Scanner;;
public class switches{
  public static void main(String[] args) {
    System.out.println("welcome!");
    Scanner input=new Scanner(System.in);
    System.out.println("please enter the day:");
    int day=input.nextInt();

    switch (day) {
      case 1:
        System.out.println("it is monday");
        break;
      case 2:
        System.out.println("it is tuesday");
        break;
      case 3:
        System.out.println("it is wednesday");
        break;
      case 4:
        System.out.println("it is thursday");
        break;
      case 5:
        System.out.println("it is friday");
        break;
      case 6:
        System.out.println("it is saturday");
        break;
      case 7:
        System.out.println("it is sunday");
        break;
    
      default:
        break;
    }

  }
  
}
