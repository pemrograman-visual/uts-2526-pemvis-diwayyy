import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int result, faktorial, x;

        x = Integer.parseInt(input.nextLine());
        result = faktorial(x);
        System.out.println(result);
    }
    
    public static double faktorial(int x) {
        double result;

        if (x == 1) {
            result = 1;
        } else {
            result = x * faktorial(x - 1);
        }
        
        return result;
    }
}
