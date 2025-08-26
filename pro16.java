import java.util.Scanner;

public class pro16 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int first=input.nextInt();
    int second=input.nextInt();
    int lcm=lcm(first,second);
    System.out.println("lcm of a number is:"+lcm);
  }

  public static int lcm(int first,int second){
    int i=1;
    while(true){
      int factor=first*i;
      if (factor%second==0){
        return factor;
      }
      i++;
    }

    
  }
}
