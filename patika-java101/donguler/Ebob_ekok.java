import java.util.Scanner;

public class Ebob_ekok {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        int smallN;

        if(number1 > number2){
            smallN = number1;
        }else if(number1 == number2){
            smallN = number1;
        }else{
            smallN = number2;
        }

        while (smallN > 0){
            if((number1 % smallN == 0) && (number2 % smallN == 0)){
                System.out.println("Greatest common divisor: " + smallN);
                break;
            }
            smallN--;
        }

        int ekok = (number1 * number2) / smallN;
        System.out.println("Least common floor: " + ekok);

    }
}
