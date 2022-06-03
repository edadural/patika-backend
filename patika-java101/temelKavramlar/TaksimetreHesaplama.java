/*
gidilen mesafeye (KM) göre taksimetre tutarini ekrana yazdiran program

-Taksimetre KM basina 2.20 TL tutmaktadir.
-Minimum odenecek tutar 20 TL'dir. 20 TL altinda ki ucretlerde yine 20 TL alinacaktir.
-Taksimetre aciliş ucreti 10 TL'dir.
 */

import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {
        int acilis=10;
        double km=2.20,gidilenMesafe,tutar=20;

        System.out.print("Gidilen mesafe (km): ");
        Scanner input = new Scanner(System.in);
        gidilenMesafe = input.nextDouble();

        tutar = (gidilenMesafe*km+acilis>tutar)? gidilenMesafe*km+acilis : tutar;
        System.out.println("Gidilen mesafeye göre taksimetre tutari: " + tutar);

    }
}
