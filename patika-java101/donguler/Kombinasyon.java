import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        // C(n,r) = n! / (r! * (n-r)!)

        int n, r;
        double totalN = 1, totalR = 1, total = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("C(n,r) icin N : ");
        n = scan.nextInt();
        System.out.print("R : ");
        r = scan.nextInt();

        for (int i = 1; i <= n; i++)
            totalN *= i;

        for (int j = 1; j <= r; j++)
            totalR *= j;

        for (int k = 1; k <= n - r; k++)
            total *= k;

        double sonuc = totalN / (totalR * total);

        System.out.println("C(n,r) : " + sonuc);
    }
}
