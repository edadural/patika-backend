import java.util.Scanner;

public class DortveBesinKuvvetleri {
    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Number: ");
        number = input.nextInt();

        System.out.println("4'un katlari: ");
        for (int i = 1; i <= number; i *= 4)
            System.out.print(i + " - ");

        System.out.println("");
        System.out.println("5'in katlari: ");
        for (int j = 1; j < number; j *= 5)
            System.out.print(j + " - ");
    }
}
