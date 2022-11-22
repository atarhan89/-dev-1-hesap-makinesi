import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner klavye = new Scanner(System.in);


        String islem;
        int sayı1, sayı2;

        System.out.println("lütfen  sayı1 giriniz!");
        sayı1 = klavye.nextInt();

        System.out.println("Isleminizi seciniz: ( + , - , * , / , ^ ): ");

        islem= klavye.next();


        System.out.println("lütfen  sayı2 giriniz?");
        sayı2 =klavye.nextInt();

        switch (islem) {
            case"+":
                System.out.println(sayı1+sayı2);
                break;
            case "-" :
                System.out.println(sayı1-sayı2);
                break;
            case"*":
                System.out.println(sayı1 * sayı2);
                break;
            case"/":
                System.out.println("tanımsız");
                break;

            case"^":
                System.out.println(sayı1^sayı2);
                break;
            default:
                System.out.println("geçersiz işlem");


        }


    }
}