import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int year;
        String zodyag="";
        System.out.print("Dogum yiliniz: ");
        Scanner input = new Scanner(System.in);
        year = input.nextInt();

        if (year<0)
            System.out.println("Hatali giris");
        else {
            switch (year%12){
                case 0:
                    zodyag = "Maymun";
                    break;
                case 1:
                    zodyag = "Horoz";
                    break;
                case 2:
                    zodyag = "Kopek";
                    break;
                case 3:
                    zodyag = "Domuz";
                    break;
                case 4:
                    zodyag = "Fare";
                    break;
                case 5:
                    zodyag = "Okuz";
                    break;
                case 6:
                    zodyag = "Kaplan";
                    break;
                case 7:
                    zodyag = "Tavsan";
                    break;
                case 8:
                    zodyag = "Ejderha";
                    break;
                case 9:
                    zodyag = "Yilan";
                    break;
                case 10:
                    zodyag = "At";
                    break;
                case 11:
                    zodyag = "Koyun";
                    break;
            }
            System.out.println("Cin zodyagi burcunuz: " + zodyag);
        }
    }
}
