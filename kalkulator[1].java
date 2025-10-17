//12S25003_Afrian Josse siadari
//12S25004_Sapna Agnes Napitupulu
//12S25042_Dewi Natasya Sitorus

import java.util.*;
import java.lang.Math;

public class Uts {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double jl, k, kl, bg;
        double a, b;
        String pilihan;

        pilihan = input.nextLine();
        if (pilihan.equals("1")) {
            a = Double.parseDouble(input.nextLine());
            b = Double.parseDouble(input.nextLine());
            jl = a + b;
            System.out.println(jl);
        } else {
            if (pilihan.equals("2")) {
                a = Double.parseDouble(input.nextLine());
                b = Double.parseDouble(input.nextLine());
                k = a - b;
                System.out.println(k);
            } else {
                if (pilihan.equals("3")) {
                    a = Double.parseDouble(input.nextLine());
                    b = Double.parseDouble(input.nextLine());
                    kl = a * b;
                    System.out.println(kl);
                } else {
                    if (pilihan.equals("4")) {
                        a = Double.parseDouble(input.nextLine());
                        b = Double.parseDouble(input.nextLine());
                        bg = a / b;
                        System.out.println(bg);
                    }
                }
            }
        }
    }
}
