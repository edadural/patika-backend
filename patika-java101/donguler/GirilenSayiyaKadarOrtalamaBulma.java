import java.util.Scanner;

public class GirilenSayiyaKadarOrtalamaBulma {
    public static void main(String[] args) {

        int number, count = 0;
        double sum=0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("number: ");
        number = input.nextInt();

        System.out.println("3 ve 4'e tam bolunen sayilar: ");

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
                System.out.print(" " + i);
            }
        }
        System.out.println(" ");
        System.out.println("\"3 ve 4'e tam bolunen sayilarin ortalamasi: " + sum / count);
    }
}
