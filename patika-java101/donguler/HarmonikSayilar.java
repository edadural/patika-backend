import java.util.Scanner;

public class HarmonikSayilar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N sayisi: ");
        int N = input.nextInt();
        double result = 0.0;

        for (int i=1; i<=N; i++){
            result += (1.0/i);
        }
        System.out.println("Harmonik serisi: " + result);
    }
}
