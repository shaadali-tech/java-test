import java.util.Scanner;

public class diagonalsum {
  public static void main(String[] args) {
    System.out.println("Welcome to Shaad Coding");
    int[][] numarray=ArrayUtility.input2DArray();
    System.out.println("now we are going to print diagonal sum of 2d array:");
    long sum=getdiagonalsum(numarray);
    System.out.println("here is the sum of Diagonal elements: "+sum);
}


public static long getdiagonalsum(int[][] numarray){
  long leftsum=leftsum(numarray);
  long rightsum=rightsum(numarray);
  long sum=leftsum+rightsum;

  if (numarray.length%2!=0) {
      int ind=numarray.length/2;
      sum=sum-numarray[ind][ind];

  }

  return sum;


}



  public static long leftsum(int[][] numarray){
     long sum=0;
     int i=0;
     while (i<numarray.length) {
      int col=numarray.length-1-i;
      sum+=numarray[i][col];
      i++;
     }
    return sum;
  }



  public static long rightsum(int[][] numarray){
    int i=0;
    int rightsum=0;
    while (i<numarray.length) {
      rightsum+=numarray[i][i];
        
        i++;
      }
      
    

    return rightsum;

  }
}
