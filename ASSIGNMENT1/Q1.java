import  java.util.*;
public class Q1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer greater than 2: ");
        int number = input.nextInt();
        int count = 0;
        while (number >= 2) {
            number /= 2;
            count++;
        }

        System.out.println(count);

      input.close();
    }
    
}
