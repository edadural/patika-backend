import java.util.Scanner;

public class HesapMakinesi {

    static void plus(){
        Scanner input = new Scanner(System.in);
        System.out.print("kac tane sayi gireceksiniz: ");
        int count = input.nextInt();
        int number, result = 0;

        for (int i=1; i<=count; i++){
            System.out.print(i + ". sayi: ");
            number = input.nextInt();
            if (i == 1){
                result = number;
                continue;
            }
            result += number;
        }
        System.out.println("Toplam: " + result);
    }

    static void minus(){
        Scanner input = new Scanner(System.in);
        System.out.print("kac tane sayi gireceksiniz: ");
        int count = input.nextInt();
        int number, result = 0;

        for (int i=1; i<=count; i++){
            System.out.print(i + ". sayi: ");
            number = input.nextInt();
            if(i==1){
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuc: " + result);
    }

    static void times(){
        Scanner input = new Scanner(System.in);
        System.out.print("kac tane sayi gireceksiniz: ");
        int count = input.nextInt();
        int number, result = 1;

        for (int i=1; i<=count; i++){
            System.out.print(i + ".sayi: ");
            number = input.nextInt();

            if (i == 1){
                result = number;
                continue;
            }
            result *= number;
        }
        System.out.println("Sonuc: " + result);
    }

    static void divided() {
        Scanner input = new Scanner(System.in);
        System.out.print("kac tane sayi gireceksiniz: ");
        int count = input.nextInt();
        double number, result = 0.0;

        for (int i=1; i<=count; i++){
            System.out.print(i + ".sayi: ");
            number = input.nextInt();

            if (i == 1){
                result = number;
                continue;
            }

            if (number == 0){
                System.out.println("Bolen 0 girilemez.");
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuc: " + result);
    }

    static void power() {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban degeri: ");
        int base = input.nextInt();
        System.out.print("Us degeri: ");
        int exponent = input.nextInt();

        int result = 1;
        for (int i=1; i <= exponent; i++)
            result *= base;

        System.out.println("Sonuc: " + result);
    }

    static void factorial(){
        Scanner input = new Scanner(System.in);
        System.out.print("faktoriyeli hesaplanacak sayiyi giriniz: ");
        int number = input.nextInt();
        int result = 1;

        for (int i=1; i<=number; i++)
            result *= i;

        System.out.println("Sonuc: " + result);
    }

    static void mod() {
        Scanner input = new Scanner(System.in);
        System.out.print("birinci sayi: ");
        int number1 = input.nextInt();
        System.out.print("ikinci sayi: ");
        int number2 = input.nextInt();

        if (number2 == 0)
            System.out.println("ikinci deger 0'dan farkli olmali");
        else {
            int result = number1 % number2;
            System.out.println("Sonuc: " + result);
        }
    }

    static void calc(){
        Scanner input = new Scanner(System.in);
        System.out.print("birinci kenar: ");
        int number1 = input.nextInt();
        System.out.print("ikinci kenar: ");
        int number2 = input.nextInt();

        if (number1 == 0 || number2 == 0)
            System.out.println("kenarlar 0'dan farkli olmali");
        else {
            System.out.println("Cevre: " + ( 2 * (number1 + number2) ) );
            System.out.println("Alan: " + (number1 * number2) );
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = """

                1- Toplama İslemi
                2- Cikarma İslemi
                3- Carpma İslemi
                4- Bolme İslemi
                5- Uslu Sayi Hesaplama
                6- Faktoriyel Hesaplama
                7- Mod Alma
                8- Dikdortgen Alan ve Cevre Hesabi
                0- Cikis
                """;

        while (true){
            System.out.println(menu);
            System.out.print("Bir islem seciniz: ");
            select = scan.nextInt();

            if (select == 0)
                break;

            switch (select) {
                case 1 -> plus();
                case 2 -> minus();
                case 3 -> times();
                case 4 -> divided();
                case 5 -> power();
                case 6 -> factorial();
                case 7 -> mod();
                case 8 -> calc();
                default -> System.out.println("Gecersiz islem.");
            }
        }
        System.out.println("Cikis yapiliyor..");
    }
}
