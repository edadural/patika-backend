import java.util.Scanner;

public class UcakBiletFiyati {
    public static void main(String[] args) {
        int km, yas,yolculukTipi;
        double total=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = input.nextInt();
        System.out.print("Yasiniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipiniz (1 -> tek yon, 2 -> gidis donus): ");
        yolculukTipi = input.nextInt();

        if( km<0 || yas<0 || yolculukTipi>2)
            System.out.println("Hatali veri girdiniz!");
        else{
            total = km * 0.10;
            if (yas<12)
                total -= total * 0.50;
            else if(yas>=12 && yas<=24)
                total -= total * 0.10;
            else if(yas>=65)
                total -= total * 0.30;

            if (yolculukTipi == 2){
                total -= total * 0.20;
                total *= 2;
            }
            System.out.println("Toplam tutar: " + total);
        }


    }
}
