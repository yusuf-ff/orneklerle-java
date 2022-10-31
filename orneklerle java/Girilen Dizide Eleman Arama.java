import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Kaç Sayı Gireceksiniz : ");
        Scanner girdi = new Scanner(System.in);
        int diziBoyutu = girdi.nextInt();

        int[] dizi = new int[diziBoyutu];
        System.out.println("Lütfen Sayıları Giriniz");
        for (int i = 0; i < dizi.length; i++) {
            Scanner girdi2 = new Scanner(System.in);
            int deger = girdi2.nextInt();
            dizi[i] = deger;
        }
        System.out.println("Lutfen Aranacak Değeri Giriniz : ");
        Scanner girdi3 = new Scanner(System.in);
        int aranacakSayi = girdi3.nextInt();
        boolean varMi = false;
        for (int i = 0; i < dizi.length; i++) {
            if (aranacakSayi == dizi[i]) {
                varMi = true;
            }
        }
        if (varMi == true) {
            System.out.println("Aradığınız Sayı Dizide Vardır.");
        } else
            System.out.println("Aradığınız Sayı Dizide Yoktur.");

    }
}