//12S25003_Afrian Josse siadari
//12S25004_Sapna Agnes Napitupulu
//12S25042_Dewi Natasya Sitorus

import java.util.*;
import java.lang.Math;

public class Uts {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double[] ns = new double[4];
        double nrt, nt, nr, total, max, min;
        int i, x;

        System.out.println("Masukkan jumlah mahasiswa:");
        i = 0;
        total = 0;
        x = Integer.parseInt(input.nextLine());
        System.out.println("Masukkan nilai:");
        for (i = 0; i <= 3; i++) {
            ns[i] = Double.parseDouble(input.nextLine());
            total = total + ns[i];
        }
        nrt = total / 4;
        max = 0;
        for (i = 0; i <= 3; i++) {
            if (ns[i] > max) {
                max = ns[i];
            }
        }
        min = ns[0];
        for (i = 0; i <= 3; i++) {
            if (ns[i] < min) {
                min = ns[i];
            }
        }
        System.out.println("Rata-rata = " + nrt);
        System.out.println("Tertinggi = " + max);
        System.out.println("Terendah = " + min);
    }
}
