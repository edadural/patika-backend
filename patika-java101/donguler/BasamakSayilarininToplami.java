import java.util.Scanner;

public class BasamakSayilarininToplami {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi: ");
        int number = input.nextInt();
        int total = 0, numberDigit = 0, digitValue;

        while (number != 0) {
            digitValue = number % 10;
            total += digitValue;
            number /= 10;
        }
        System.out.println(total);
    }
}