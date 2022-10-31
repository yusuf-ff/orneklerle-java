public class Main {
    public static void main(String[] args) {
        int dizi[] = new int[100];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100 + 1);
        }

        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + ",");
        }
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam = toplam + dizi[i];
        }

        double ortalama = toplam / (double) 100;
        System.out.println("\nOrtalama =  " + ortalama);
        int sayac = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] < ortalama) {
                sayac++;
            }
        }
        System.out.println("Ortalamanın Altında " + sayac + " Tane Sayı Vardır.");
    }
}