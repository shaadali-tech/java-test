import java.util.Scanner;

public class sums {

  public static void main(String[] args) {
    // Create a Scanner object to read input
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter two numbers
    System.out.println("Please Enter Two Numbers:");

    // Read the two integers from the user
    int a = input.nextInt();
    int b = input.nextInt();

    // Calculate the sum
    int sum = a + b;

    // Print the final result
    System.out.println("The sum is: " + sum);
    
    // Close the scanner to prevent resource leaks
    input.close();
  }
}