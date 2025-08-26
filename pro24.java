
import java.util.Scanner;

public class pro24 {
  public static void main(String[] args) {
    int[] array={1,3,5,34,88,65,4};
    Scanner input=new Scanner(System.in);
    System.out.println("please enter a number you want to search:");
    int num=input.nextInt();
    boolean traverse=traverse(num, array);
    if (traverse) {
      System.out.println("number is found");
    }
    else{
      System.out.println("number is not found");
    }

  }

  public static boolean traverse(int num,int[] array){
    int index=0;
    while(index<array.length){
      if (array[index]== num){
        return true;
        }
       index++;
      
    }

    return false;

  }
}
