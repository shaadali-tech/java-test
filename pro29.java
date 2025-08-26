import java.util.Scanner;

public class pro29 {
  public static void main(String[] args) {
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

  System.out.println("suxsex");
  int maximum=0;
  int minimum=Integer.MAX_VALUE;
  int j=0;
  while (j<size) {
    if (array[j]>=maximum) {
      maximum=array[j];
     }

    if (array[j]<=minimum){
      minimum=array[j];
      
    }
    j++;
    
  }

  System.out.println("maximum element is :"+maximum);
  System.out.println("Minimum element in array is : "+minimum);

  }
}
