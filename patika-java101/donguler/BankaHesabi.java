import java.util.Scanner;

public class BankaHesabi {
    public static void main(String[] args) {

        // donguler ile kullanicinin banka hesabini yonetebildigi bir ATM projesi

        String userName, password;
        int right = 3, balance = 1500;
        int price, select;
        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Kullanici adiniz: ");
            userName = input.nextLine();
            System.out.print("Parolaniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz");
                do {
                    System.out.println("1-Para yatirma\n" +
                            "2-Para cekme\n" +
                            "3-Bakiye sorgula\n" +
                            "4-Cikis yap");
                    System.out.print("Yapmak istediginiz islemi seciniz: ");
                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.print("Para miktari: ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktari: ");
                            price = input.nextInt();
                            if (price > balance)
                                System.out.println("Bakiye yetersiz.");
                            else
                                balance -= price;
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                    }
                } while (select != 4);
                break;

            } else {
                right--;
                System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz.");
                if (right == 0)
                    System.out.println("Hesabiniz bloke olmudtur. Banka ile iletisime geciniz.");
                else
                    System.out.println("Kalan hakkiniz: " + right);
            }
        }
    }
}
