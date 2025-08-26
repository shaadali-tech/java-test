import java.util.Scanner;

public class pro27 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("please enter the size of array:");
    int size=input.nextInt();

    int[] nums=new int[size];
    int j=0;
    while(j<size){
      System.out.println("please enter element number:"+(j+1)+": ");
      nums[j]=input.nextInt();
      j++;

    }


    int i=0;
    int sum=0;
    while(i<nums.length){
      sum+=nums[i];
      i++;
    }
    int average=sum/size;
    System.out.println("sum of the array: "+sum);
    System.out.println("average of the array: "+average);
  }
}
