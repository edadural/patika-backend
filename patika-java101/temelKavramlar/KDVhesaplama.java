import java.util.Scanner;

/*
Eger girilen tutar 0 ve 1000 TL arasinda ise KDV orani %18 ,
tutar 1000 TL'den buyuk ise KDV oranini %8 olarak KDV tutari hesaplayan program
*/

public class KDVhesaplama {
    public static void main(String[] args) {
        double tutar,KDVtutar,KDVoran;

        Scanner input = new Scanner(System.in);
        System.out.print("Fiyat: ");
        tutar = input.nextDouble();

        KDVoran = (tutar>1000)? 0.08 : 0.18;
        KDVoran *= tutar;
        KDVtutar = KDVoran + tutar;

        System.out.println("KDV'siz tutar: " + tutar);
        System.out.println("KDV tutari: " + KDVoran);
        System.out.println("KDV'li fiyat: " + KDVtutar);
    }
}