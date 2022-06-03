import java.util.Scanner;

/*
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan program
 */

public class UcgendeAlanHesabi {
    public static void main(String[] args) {
        int kenar1,kenar2,kenar3,u;
        double alan,x;

        Scanner kenar = new Scanner(System.in);
        System.out.print("1.kenar: ");
        kenar1 = kenar.nextInt();
        System.out.print("2.kenar: ");
        kenar2 = kenar.nextInt();
        System.out.print("3.kenar: ");
        kenar3 = kenar.nextInt();

        u = (kenar1+kenar2+kenar3)/2;

        System.out.println("Cevre: " + (2*u) );
        System.out.println("Alan: "+ Math.sqrt( ( u*(u-kenar1) ) * (u*(u-kenar2)) * (u*(u-kenar3)) ));
    }
}
