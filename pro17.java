import java.util.Scanner;

public class pro17{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.print("Enter first number: ");
        int first = input.nextInt();

        System.out.print("Enter second number: ");
        int second = input.nextInt();

        int hcf = hcf(first, second);
        System.out.println("HCF of " + first + " and " + second + " is: " + hcf);

        input.close();
    }

    // Method to calculate HCF
    public static int hcf(int first, int second) {
        int gcd = 1;
        int i = 2;
        int least = least(first, second);   // ✅ fixed variable names

        while (i <= least) {
            if (first % i == 0 && second % i == 0) {  // ✅ fixed
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    // Method to find smaller number
    public static int least(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
