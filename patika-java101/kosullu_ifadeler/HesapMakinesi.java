<<<<<<< HEAD
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int number1,number2,select;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayi: ");
        number1 = input.nextInt();
        System.out.print("ikinci sayi: ");
        number2 = input.nextInt();
        System.out.print("1->Toplama\n2->Cikarma\n3->Bolme\n4->Carpma\nSeciminiz: ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: "+ (number1+number2));
                break;
            case 2:
                System.out.println("Cikarma: "+ (number1-number2));
                break;
            case 3:
                if (number2!=0)
                    System.out.println("Bolme: "+ (number1/number2));
                else
                    System.out.println("sayi 0'a bolunemez");
                break;
            case 4:
                System.out.println("Carpma: "+ (number1*number2));
                break;
            default:
                System.out.println("Gecersiz secim");
                break;
        }

    }
}
>>>>>>> 4b53dd84c671d687e27f50dc9c9a1dd2cdf6e87a
