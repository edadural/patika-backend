import java.util.Scanner;

public class YildizlarlaElmas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayisi: ");
        int number = input.nextInt();

        for (int i=1; i<=number; i++){

            for (int bosluk=1; bosluk <= (number - i); bosluk++)    // yildizdan once bosluk yazdirma
                System.out.print(" ");

            for (int yildiz=1; yildiz <= (2*i)-1; yildiz++)         // yildiz yazdirma
                System.out.print("*");

            System.out.println();
        }

        for (int i=number-1; i>=1; i--){                            // ters ucgen yazdirma

            for (int bosluk=(number - i); bosluk>0; bosluk--)
                System.out.print(" ");

            for (int yildiz=(2*i)-1; yildiz>0; yildiz--)
                System.out.print("*");

            System.out.println();
        }

    }
}
