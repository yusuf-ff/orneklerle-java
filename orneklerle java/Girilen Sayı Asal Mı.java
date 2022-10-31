import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        int sayi = girdi.nextInt();
        boolean kontrol = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                kontrol = false;
            }
        }
        if (kontrol) {
            System.out.println("Girdiğiniz Sayı Asaldır.");
        } else
            System.out.println("Girdiğiniz Sayı Asal Değildir.");

    }
}