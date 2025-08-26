import java.util.Scanner;


public class pro33 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("please enter the size of an array:");
    int size=input.nextInt();
    int[] array=new int[size];

    int i=0;
    while (i<array.length) {
      System.out.println("please enter the "+(i+1) +" element: ");
      array[i]=input.nextInt();
      i++;
    }

    int j=0;
    while(j<array.length/2){
      if (array[j]!=array[array.length-1-j]) {
        System.out.println("not a palindrome");
      }
      else{
        System.out.println("oHHHHHH yeah");
      }

      j++;
    }
  }
}
