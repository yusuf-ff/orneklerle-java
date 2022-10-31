import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Lütfen Sıralamak İstediğiniz Dizinin Boyutunu Giriniz : ");
        Scanner girdi = new Scanner(System.in);
        int diziBoyutu = girdi.nextInt();
        int dizi[] = new int[diziBoyutu];
        System.out.println("Lütfen Dizi Elemanlarını Giriniz : ");
        for (int i=0;i<diziBoyutu;i++){
            dizi[i]=girdi.nextInt();
        }
        selectionSort(dizi);
    }
    public static void selectionSort(int[] dizi) {

        for (int i=0;i< dizi.length-1;i++){
            int oAnKiEnKucukSayi = dizi[i];
            int oAnKiEnKucukElemaninIndexi = i;
            for (int j= i+1;j<dizi.length;j++){
                if (oAnKiEnKucukSayi>dizi[j]){
                    oAnKiEnKucukSayi=dizi[j];
                    oAnKiEnKucukElemaninIndexi=j;
                }
            }
            if (oAnKiEnKucukElemaninIndexi!=i){
                dizi[oAnKiEnKucukElemaninIndexi]=dizi[i];
                dizi[i]=oAnKiEnKucukSayi;
            }

        }
        for (int i=0;i< dizi.length;i++){
            System.out.print(dizi[i]+",");
        }
    }








}
