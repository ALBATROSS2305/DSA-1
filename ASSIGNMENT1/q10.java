import java.util.*;
public class q10 {
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0.0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        for (int j = 0; j < 4; j++) {
            System.out.println("Sum of elements in column " + j + " is " + sumColumn(matrix, j));
        }
        input.close();
    }
}