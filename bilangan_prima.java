//12S25003_Afrian Josse siadari
//12S25004_Sapna Agnes Napitupulu
//12S25042_Dewi Natasya Sitorus

import java.util.*;
import java.lang.Math;

public class uts {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i;

        n = Integer.parseInt(input.nextLine());
        for (i = 2; i <= n; i++) {
            if (isPrima(i)) {
                System.out.println(Integer.toString(n) + "");
            }
        }
        System.out.println("");
    }
    
    public static boolean isPrima(int x) {
        int i;

        if (x < 2) {
        } else {
            for (i = 2; i <= x - 1; i++) {
                if (x % i == 0) {
                }
            }
        }
        
        return ;
    }
}
