import java.util.Scanner;

public class YildizlarlaUcgenYapimi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayisi: ");
        int number = input.nextInt();

        for (int i=1; i<=number; i++){

            for (int bosluk=1; bosluk <= (number - i); bosluk++)    // yildizdan once bosluk yazdirma
                System.out.print(" ");

            for (int yildiz=1; yildiz <= (2*i)-1; yildiz++)   // yildiz yazdirma
                System.out.print("*");

            System.out.println();
        }

    }
}

