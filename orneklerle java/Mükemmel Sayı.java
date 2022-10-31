import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        int sayi = girdi.nextInt();
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam = toplam + i;
            }
        }
        if (toplam == sayi) {
            System.out.println("Girdiğiniz Sayı Mükemmel Sayıdır.");
        } else
            System.out.println("Girdiğiniz Sayı Mükemmel Sayı Değildir.");
    }
}