public class Palindrom {

    static boolean isPalindrom(int number){

        /*
        bir sayinin "Palindrom Sayi" olup olmadigini bulan program
        Palindromik sayı, iki taraftan okundugu zaman okunus yonuyle ayni olan sayilardir.
        orn: 1, 4, 8, 99, 101, 363, 4004, 9889....
         */


        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0){
            System.out.println("***************");
            System.out.println("Number => " + temp);
            lastNumber = temp % 10;
            System.out.println("Last number => " + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("new number => " + reverseNumber);
            temp /= 10;
        }
        return (number == reverseNumber)? true : false;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrom(247742));
    }
}
