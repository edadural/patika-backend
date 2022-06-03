import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Dogdugunuz ay (sayi olarak): ");
        month = input.nextInt();
        System.out.print("Dogdugunuz gun: ");
        day = input.nextInt();

        if(month == 1){
            burc = (day <= 21)? "Oglak":
                    (day <= 31 )? "Kova": "Hatali giris!";
        }
        else if(month == 2){
            burc = (day <= 19)? "Kova":
                    (day <= 29 )? "Balik": "Hatali giris!";
        }
        else if(month == 3){
            burc = (day <= 20)? "Balik":
                    (day <= 31 )? "Koc": "Hatali giris!";
        }
        else if(month == 4){
            burc = (day <= 20)? "Koc":
                    (day <= 30 )? "Boga": "Hatali giris!";
        }
        else if(month == 5){
            burc = (day <= 21)? "Boga":
                    (day <= 31 )? "Ikizler": "Hatali giris!";
        }
        else if(month == 6){
            burc = (day <= 22)? "Ikizler":
                    (day <= 30 )? "Yengec": "Hatali giris!";
        }
        else if(month == 7){
            burc = (day <= 22)? "Yengec":
                    (day <= 31 )? "Aslan": "Hatali giris!";
        }
        else if(month == 8){
            burc = (day <= 22)? "Aslan":
                    (day <= 31 )? "Basak": "Hatali giris!";
        }
        else if(month == 9){
            burc = (day <= 22)? "Basak":
                    (day <= 30 )? "Terazi": "Hatali giris!";
        }
        else  if(month == 10){
            burc = (day <= 22)? "Terazi":
                    (day <= 31 )? "Akrep": "Hatali giris!";
        }
        else if(month == 11){
            burc = (day <= 21)? "Akrep":
                    (day <= 30 )? "Yay": "Hatali giris!";
        }
        else if(month == 12){
            burc = (day <= 21)? "Yay":
                    (day <= 31 )? "Oglak": "Hatali giris!";
        }
        else
            System.out.println("Hatali giris!");
        System.out.println("Burcunuz: " + burc);

    }
}
