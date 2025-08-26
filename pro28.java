import java.util.Scanner;

public class pro28 {
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
 System.out.println("please enter the element you want to traverse: ");
 int traverse=input.nextInt();
 int count=0;
 int j=0;
 while(j<size){
  if(array[j]==traverse){
    count+=1;
  }
  j++;
 }
 System.out.println("number of time the element occured is:"+count);


  }
 
}
