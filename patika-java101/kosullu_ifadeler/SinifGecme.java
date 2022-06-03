import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int matematik, fizik, kimya, muzik, turkce;
        double average, total=0, count=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        matematik = input.nextInt();
        if( matematik<0 || matematik>100 )
            System.out.println("Gecersiz not!");
        else{
            total += matematik;
            count++;
        }

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        if( fizik<0 || fizik>100 )
            System.out.println("Gecersiz not!");
        else{
            total += fizik;
            count++;
        }

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        if( kimya<0 || kimya>100 )
            System.out.println("Gecersiz not!");
        else{
            total += kimya;
            count++;
        }

        System.out.print("Muzik notunuz: ");
        muzik = input.nextInt();
        if( muzik<0 ||muzik>100 )
            System.out.println("Gecersiz not!");
        else{
            total += muzik;
            count++;
        }

        System.out.print("Turkce notunuz: ");
        turkce = input.nextInt();
        if( turkce<0 || turkce>100 )
            System.out.println("Gecersiz not!");
        else{
            total += turkce;
            count++;
        }

        average = total/count;
        System.out.println("Ortalamaniz: " + average);

        if (average < 55)
            System.out.println("Sinifi gecemediniz!");
        else
            System.out.println("Sinifi gectiniz.Tebrikler!");
    }
}
