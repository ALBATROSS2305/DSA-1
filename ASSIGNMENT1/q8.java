import java.util.*;
public class q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = input.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of elements: " + sum);
        input.close();
    }
}