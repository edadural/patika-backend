import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year;
        System.out.print("Yil giriniz: ");

        Scanner input = new Scanner(System.in);
        year = input.nextInt();

        if(year%400==0)
            System.out.println(year + " artik yil!");
        else{
            if (year%100==0)
                System.out.println(year + " artik yil degil!");
            else if(year%4==0)
                System.out.println(year + " artik yil!");
            else
                System.out.println(year + " artik yil degil!");
        }
    }
}
