import java.util.Scanner;

public class pro30 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    
    System.out.println("please enter the size of an aaray:");
    int size=input.nextInt();
    int[] array=new int[size];

    int i=0;
    while(i<array.length){
      System.out.println("please enter the element" +i+" of an aaray:");
      array[i]=input.nextInt();
      i++;
    }
    boolean sorted=true;
   int j=0;
   int k=1;
   while(j<array.length-1){
    if(array[j]>=array[k]){
      sorted=false;
      break;
    }
   
    j++;
    k++;
   }

  if (sorted) {
    System.out.println("array is sorted");
    
  }
  else{
    System.out.println("array is not sorted");
  }
  }
}
