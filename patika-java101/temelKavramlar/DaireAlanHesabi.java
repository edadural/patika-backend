/*
-Yaricapi r, merkez acisinin olcusu 𝛼 olan daire diliminin alanini bulan program
-𝜋 sayisi = 3.14
-Formul : (𝜋 * (r*r) * 𝛼) / 360
 */

import java.util.Scanner;

public class DaireAlanHesabi {
    public static void main(String[] args) {
        int yaricap,acıOlcusu;
        double alan,pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yaricapi: ");
        yaricap = input.nextInt();
        System.out.print("Dairenin aci olcusu: ");
        acıOlcusu  = input.nextInt();

        alan = (pi * yaricap * yaricap * acıOlcusu)/360;
        System.out.println("Dairenin alani: " + alan);

    }
}
