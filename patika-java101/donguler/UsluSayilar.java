import java.util.Scanner;

public class UsluSayilar {
    public static void main(String[] args) {

        int sub, sup, total = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Ussu alinacak sayi: ");
        sub = input.nextInt();
        System.out.print("Us olacak sayi: ");
        sup = input.nextInt();

        for (int i = 0; i < sup; i++)
            total *= sub;

        System.out.println("Sonuc: " + total);
    }
}
