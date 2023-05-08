import java.util.*;
public class q6 {
    public static boolean isOdd(int n){
        if((n&1)==1)
        return false;
        return true;
    }
    public static void main(String args[]){
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        System.out.println(isOdd(n));
        SC.close();
    }
}
