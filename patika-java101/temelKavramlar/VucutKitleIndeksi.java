import java.util.Scanner;

/*
kullanicidan boy ve kilo degerlerini alip bir degiskene atayip
formule ( Kilo (kg) / Boy(m) * Boy(m) ) gore kullanicinin "Vucut Kitle İndeks" degerini hesaplama
 */
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double boy, kilo, indeks;

        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuz(m): ");
        boy = input.nextDouble();
        System.out.print("Kilonuz(kg): ");
        kilo = input.nextDouble();

        indeks = kilo/(boy*boy);
        System.out.println("Vucut kitle indeksiniz: " + indeks);

    }
}
