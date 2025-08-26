import java.util.Scanner;

public class pro12 {


  public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
  int number=input.nextInt();

  int table=1;
  while(table<11){
    System.out.println(number*table);
    table++;
    
  }

  input.close();
  }

}
