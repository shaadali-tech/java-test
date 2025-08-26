import java.util.Scanner;

public class sum2darray {
  public static void main(String[] args) {
    System.out.println("Welcome to shaad coding");
    int[][] numarray = ArrayUtility.input2DArray();

    int sum = sum(numarray);
    System.out.println("Here is the sum: " + sum);

    double average = average(numarray);
    System.out.println("Here is the average: " + average);
  }

  // Method to calculate average
  public static double average(int[][] numarray) {
    int sum = sum(numarray); // calculate sum
    int totalElements = 0;

    // count total elements (works even for jagged arrays)
    for (int i = 0; i < numarray.length; i++) {
      totalElements += numarray[i].length;
    }

    return (double) sum / totalElements; // cast to double for correct division
  }

  // Method to calculate sum
  public static int sum(int[][] numarray) {
    int sum = 0;
    int i = 0;

    while (i < numarray.length) {
      int j = 0;
      while (j < numarray[i].length) {
        sum = sum + numarray[i][j];
        j++;
      }
      i++;
    }
    return sum;
  }
}
