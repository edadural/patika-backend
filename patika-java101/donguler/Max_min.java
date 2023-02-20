import java.util.Scanner;

public class Max_min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, count=1, min=0, max=0, temp;

        System.out.print("Kac tane sayi gireceksiniz: ");
        sayi = input.nextInt();

        if(sayi <= 0)
            System.out.println("-");
        else {
            System.out.print(count + ".sayi: ");
            temp = input.nextInt();
            min = temp;
            max = temp;

            while (sayi>1){
                count++;
                System.out.print(count + ".sayi: ");
                temp = input.nextInt();

                if(temp<min)
                    min = temp;

                if(temp>max)
                    max = temp;

                sayi--;
            }

            System.out.println("Girdiginiz sayilardan en buyugu: " + max);
            System.out.println("Girdiginiz sayilardan en kucugu: " + min);
        }
    }
}
