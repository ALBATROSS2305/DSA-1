import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("Your BMI is %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        input.close();
    }
}
