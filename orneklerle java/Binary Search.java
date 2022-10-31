import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lütfen Sıralamak İstediğiniz Dizinin Boyutunu Giriniz : ");
        Scanner girdi = new Scanner(System.in);
        int diziBoyutu = girdi.nextInt();
        int dizi[] = new int[diziBoyutu];
        System.out.println("Lütfen Dizi Elemanlarını Giriniz : ");
        for (int i = 0; i < diziBoyutu; i++) {
            dizi[i] = girdi.nextInt();
        }
        selectionSort(dizi);
        System.out.println("Lütfen Aranacak Sayıyı Giriniz :");
        int aranacakSayi = girdi.nextInt();
        int sonuc = binarySearch(dizi, aranacakSayi);
        if (sonuc > 0) {
            System.out.println("Aranan Sayı Dizinin " + sonuc + " .İndeksindedir.");
        } else System.out.println("Aradığınız Sayı Dizide Yoktur.");
    }

    public static void selectionSort(int[] dizi) {

        for (int i = 0; i < dizi.length - 1; i++) {
            int oAnKiEnKucukSayi = dizi[i];
            int oAnKiEnKucukElemaninIndexi = i;
            for (int j = i + 1; j < dizi.length; j++) {
                if (oAnKiEnKucukSayi > dizi[j]) {
                    oAnKiEnKucukSayi = dizi[j];
                    oAnKiEnKucukElemaninIndexi = j;
                }
            }
            if (oAnKiEnKucukElemaninIndexi != i) {
                dizi[oAnKiEnKucukElemaninIndexi] = dizi[i];
                dizi[i] = oAnKiEnKucukSayi;
            }

        }
    }

    public static int binarySearch(int[] dizi, int aranacakSayi) {

        int enDusukIndex = 0;
        int enYuksekIndex = dizi.length - 1;
        while (enYuksekIndex >= enDusukIndex) {
            int ortaIndex = (enDusukIndex + enYuksekIndex) / 2;
            if (aranacakSayi < dizi[ortaIndex]) {
                enYuksekIndex = ortaIndex - 1;

            } else if (aranacakSayi == dizi[ortaIndex]) {
                return ortaIndex;
            } else {
                enDusukIndex = ortaIndex + 1;
            }
        }

        return -enDusukIndex - 1;

    }

}
