import java.util.Scanner;

public class pro32 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("please enter the size of an array: ");
    int size=input.nextInt();
    int[] array=new int[size];

    int i=0;
    while(i<array.length){
      array[i]=input.nextInt();
      i++;
    }

    int[] newarray=new int[array.length];
    int j=0;
    while(j<array.length){
      newarray[j]=array[array.length-1-j];
      j++;


    }

    System.out.println("Here is the new array:");
    int c=0;
    while(c<newarray.length){
      System.out.println(newarray[c]);
      c++;
    }
  }
}
