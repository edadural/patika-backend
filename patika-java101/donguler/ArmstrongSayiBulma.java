import java.util.Scanner;

public class ArmstrongSayiBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi: ");
        int number = input.nextInt();
        int numberDigit = 0, tempNumber = number, result = 0;
        int digitValue, digitPow;

        /*
            Basamak Sayisi Bulma
            2451 / 10 = 245
            245 / 10 = 24
            24 / 10 = 2
            2 / 10 = 0
        */
        while (tempNumber != 0) {
            tempNumber /= 10;
            numberDigit++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            digitValue = tempNumber % 10;
            // 1*1*1*1 = 1^4
            digitPow = 1;
            for (int i = 1; i <= numberDigit; i++) {
                digitPow *= digitValue;
            }
            result += digitPow;
            tempNumber /= 10;
        }

        if (result == number)
            System.out.println(number + " armstrong sayidir.");
        else
            System.out.println(number + " armstrong sayi degildir.");
    }

}
