import java.util.Scanner;

 class pro34 {
  public static void main(String[] args) {
    System.out.println("welcome to merging sorted arrays");
    int[] array1=ArrayUtility.inputArray();
    int[] array2=ArrayUtility.inputArray();
    int[] merge=merge(array1, array2);
    System.out.println("your merged array is:");
    ArrayUtility.displayarray(merge);

  }

  public static int[] merge(int[] array1,int[]array2){
    int newsize=array1.length+array2.length;
    int[] newarray=new int[newsize];
    int i=0,j=0,k=0;
    while (i<array1.length||j<array2.length) {
      if (j==array2.length||i<array1.length&&array1[i]<array2[j]) {
        newarray[k]=array1[i];
        i++;
        k++;
        
      }
      else{
        newarray[k]=array2[j];
        j++;
        k++;
      }
    }
    return newarray;
  }
}
