import java.util.Scanner;

public class pro18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = input.nextInt();

        // Call prime method
        String result = prime(num);
        System.out.println(result);

        input.close();
    }

    // Method that returns whether a number is prime
    public static String prime(int num) {
        if (num <= 1) {
            return "Not a prime number";
        }

        int i = 2;
        while (i <= num / 2) { // check till half of number
            if (num % i == 0) {
                return "Not a prime number";
            }
            i++;
        }

        return "Prime number";
    }
}
