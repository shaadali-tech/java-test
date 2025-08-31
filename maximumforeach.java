import java.util.Scanner;

public class maximumforeach {
  public static void main(String[] args) {
    System.out.println("welcome!");
    Scanner input=new Scanner(System.in);

    int[] array=ArrayUtility.inputArray();
    int arrays=arraysed(array);
    System.out.println(arrays);

    
  }

  public static int arraysed(int[] array){
    int max=Integer.MIN_VALUE;
   
    for(int name:array){
      if (max<name) {
        max=name;
      }
      
    }
    return max;
  }
}
