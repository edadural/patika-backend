import java.util.Scanner;

/*
Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sinav puanlarini
kullanicidan alan, ortalamalarini hesaplayip ekrana bastirilan ve kullanicinin ortalamasi 60'dan
buyuk ise ekrana "Sinifi Gecti" , kucuk ise "Sinifta Kaldi" yazdiran program
 */

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int mat,fizik,kimya,turkce,tarih,muzik;

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        System.out.print("Turkce notunuz: ");
        turkce = input.nextInt();
        System.out.print("Tarih notunuz: ");
        tarih = input.nextInt();
        System.out.print("Muzik notunuz: ");
        muzik = input.nextInt();

        int toplam = mat+fizik+kimya+turkce+tarih+muzik;
        double sonuc = toplam/6.0;

        System.out.println("Ortalamaniz: "+sonuc);

        String str = (sonuc<60)? "Sinifta kaldi." : "Sinifi gecti";
        System.out.println(str);
    }
}