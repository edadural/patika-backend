import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String username, password, newPassword;
        int select;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanici ad: ");
        username = input.nextLine();
        System.out.print("Sifre:");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giris yaptiniz!");
        }else if( !(username.equals("patika")) &&  password.equals("java123") ){
            System.out.println("Kullanici adiniz hatali.");
        }else if (username.equals("patika") && !(password.equals("java123")) ) {
            System.out.println("Sifreniz hatali.");
            System.out.println("Sifre yenilemek (1) \nCikis (2)");
            select = input.nextInt();

            switch (select) {
                case 1:
                    Scanner inp = new Scanner(System.in);
                    System.out.print("Yeni sifreniz: ");
                    newPassword = inp.nextLine();

                    if (newPassword.equals("java123"))
                        System.out.println("Yeni sifre eski sifre ile ayni olamaz.");
                    else
                        System.out.println("Islem basarili");
                    break;

                case 2:
                    System.out.println("Cikis yapildi.");
                    break;

                default:
                    System.out.println("Hatali sayi girdiniz.");
                    break;
            }
        }else
            System.out.println("Bilgilerinizi kontrol ediniz!");
    }
}
