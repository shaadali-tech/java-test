import java.util.Scanner;;
public class multiplication {
  public static void main(String[] args) {
    System.out.println("welcome to multiplication program!");
    Scanner input=new Scanner(System.in);
    System.out.println("please enter the number :");
    int num=input.nextInt();
     int nums;
    for(int i=1;i<=10;i++){
      nums=num*i;
      System.out.println(num+"x"+i+"="+nums);
    }
  }

  
}
