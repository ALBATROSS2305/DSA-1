        import java.util.*;
public class q5 {
     public static void main(String args[]){
        Scanner sc  =  new Scanner(System.in);
        int num  = sc.nextInt();
        System.out.println(sumOfDigits( num));
        sc.close();
    }
   
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 9) {
            sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
   
}

