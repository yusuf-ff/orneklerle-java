import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        int uretilenSayi = (int) (Math.random() * 101);
        int tahmin = -1;
        int kacKere = 0;
        while (tahmin != uretilenSayi) {
            System.out.println("Lütfen Tahmininizi Giriniz : ");
            tahmin = girdi.nextInt();
            kacKere++;
            if (tahmin == uretilenSayi) {
                System.out.println("Tebrikler " + kacKere + " Denemede Sayıyı Buldunuz.");
            } else if (tahmin > uretilenSayi) {
                System.out.println("Tahmin Ettiğiniz Sayı Yüksek ! Lütfen Daha Düşük Bir Sayı Giriniz.");
            } else
                System.out.println("Tahmin Ettiğiniz Sayı Düşük ! Lütfen Daha Yüksek Bir Sayı Giriniz.");
        }
    }
}

