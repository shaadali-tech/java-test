import java.util.Scanner;

public class search2darray {
   public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   int [][] numarray=ArrayUtility.input2DArray();
   System.out.println("now enter the element you want to search:");
   int remove=input.nextInt();
   boolean isfound=search(numarray, remove);
   if (isfound) {
    System.out.println("element is found");
    }
   else{
    System.out.println("element is not found");
   }


   }

   public static boolean search(int numarray[][],int remove){
    int i=0;
    while(i<numarray.length){
      int j=0;
      while (j<numarray[i].length) {
        if (numarray[i][j]==remove) {
          return true;
          
        }
        j++;
      }
      i++;
      
    }
    return false;
   }

}