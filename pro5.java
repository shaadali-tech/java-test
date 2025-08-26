import java.util.Scanner;


public class pro5 {
  public static void main(String[] args) {
  System.out.println("Enter 3 numbers");
  Scanner input=new Scanner(System.in);
  int number1=input.nextInt();
  int number2=input.nextInt();
  int number3=input.nextInt();



if(number1>number2&&number1>number3){
  System.out.println("number 1 is greatest");
}
else if (number2>number1&&number2>number3) {
  System.out.println("number 2 is greatest");
}
else{
  System.out.println("number 3 is greatest");
}

input.close();
  }
}
