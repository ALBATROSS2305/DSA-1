import java.util.*;
public class q7 {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            int max = arr[0];
            int min = arr[0];
            int maxCount = 1;
            int minCount = 1;
            int maxIndex = 0;
            int minIndex = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    maxCount = 1;
                    maxIndex = i;
                } else if (arr[i] == max) {
                    maxCount++;
                }
                if (arr[i] < min) {
                    min = arr[i];
                    minCount = 1;
                    minIndex = i;
                } else if (arr[i] == min) {
                    minCount++;
                }
            }
            
            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);
            System.out.println("Number of times maximum occurs: " + maxCount);
            System.out.println("Number of times minimum occurs: " + minCount);
            System.out.println("Position of first occurrence of maximum: " + (maxIndex + 1));
            System.out.println("Position of last occurrence of minimum: " + (minIndex + 1));
            sc.close();
        }
    }
