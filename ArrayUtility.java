import java.util.Scanner;

public class ArrayUtility {


  public static int[] inputArray(){
  Scanner input=new Scanner(System.in);
  System.out.println("please enter the size of an array: ");
  int size=input.nextInt();

  int[] array=new int[size];
  int i=0;
  while(i<size){
    System.out.println("please enter the element"+(i+1) +" :");
    int nums=input.nextInt();
    array[i]=nums;
    i++;
  }
  return array;
}

  public static int[][] input2DArray(){
  Scanner input=new Scanner(System.in);
  System.out.println("please enter the row size of an array: ");
  int rows=input.nextInt();
  System.out.println("please enter the column size of an array: ");
  int column=input.nextInt();


  int[][] twoDarray=new int[rows][column];
  int i=0;
  while(i<rows){
    int j=0;
    while (j<column) {
      System.out.println("please enter the element rows"+(i+1) +" :" +"column:"+(j+1)+": ");
      twoDarray[i][j]=input.nextInt();
      j++;
    }
    i++;
  }
  return twoDarray;
}

  public static void displayarray(int[] numarray){
      int i=0;
    while (i<numarray.length) {
      System.out.print(numarray[i]+" ");
      i++;
    }
    System.out.println();
  }
  
  }

