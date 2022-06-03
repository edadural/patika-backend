import java.util.Scanner;

public class DordunKatlarininToplami {
    public static void main(String[] args) {

        int num, total = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Number: ");
            num = scan.nextInt();
            if (num%2==0 && num%4==0)
                total += num;

        } while (num % 2 == 0);

        System.out.println("Dordun katlari olan sayilarin toplami: " + total);
    }
}
