import java.util.Scanner;

public class BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        int sayi1, sayi2, sayi3;
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayi: ");
        sayi1 = input.nextInt();
        System.out.print("2. sayi: ");
        sayi2 = input.nextInt();
        System.out.print("3. sayi: ");
        sayi3 = input.nextInt();

        if ((sayi1 > sayi2) && (sayi1 > sayi3)){
            if (sayi2 > sayi3)
                System.out.println("1.sayi > 2.sayi > 3.sayi");
            else if (sayi3 > sayi2)
                System.out.println("1.sayi > 3.sayi > 2.sayi");
            else
                System.out.println("1.sayi > 2.sayi = 3.sayi");
        }
        else if((sayi2 > sayi1) && (sayi2 > sayi3)){
            if (sayi1 > sayi3)
                System.out.println("2.sayi > 1.sayi > 3.sayi");
            else if (sayi3 > sayi1)
                System.out.println("2.sayi > 3.sayi > 1.sayi");
            else
                System.out.println("2.sayi > 1.sayi = 3.sayi");
        }
        else if((sayi3 > sayi1) && (sayi3 > sayi2)){
            if (sayi1 > sayi2)
                System.out.println("3.sayi > 1.sayi > 2.sayi");
            else if (sayi2 > sayi1)
                System.out.println("3.sayi > 2.sayi > 1.sayi");
            else
                System.out.println("3.sayi > 1.sayi = 2.sayi");
        }
        else
            System.out.println("1.sayi = 2.sayi = 3.sayi");
    }
}
