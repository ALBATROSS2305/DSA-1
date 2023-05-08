import java.util.*;
public class q3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int product = 1;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }

        if (sum == product) {
            System.out.println("The number is a spy number.");
        } else {
            System.out.println("The number is not a spy number.");
        }

        scanner.close();
    }
    
}
