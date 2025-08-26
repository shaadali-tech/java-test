import java.util.Scanner;

public class pro31 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("please enter the size of an array: ");
    int size=input.nextInt();
    int[] array=new int[size];
    int i=0;
    while (i<array.length) {
      System.out.println("please enter the next element:"+(i+1));
      array[i]=input.nextInt();
      
      i++;
      
    }

 System.out.println("please enter the element you want to delete: ");
 
 int delete=input.nextInt();
 int count=0;
 int j=0;
 while(j<size){
  if(array[j]==delete){
    count+=1;
  }
  j++;
 }
 System.out.println("number of time the element occured is:"+count);
 int occurences=array.length-count;
 int[] newarray=new int[occurences];

   int k=0,l=0;
   while (k<array.length) {
    if (array[k]!=delete) {
      newarray[l]=array[k];
      l++;
    }
    k++;
   }

   System.out.println("here is the new array:");
      int m=0;
      while (m<newarray.length) {
        
        System.out.print(newarray[m]);
        m++;
      }
    }
   
  }

