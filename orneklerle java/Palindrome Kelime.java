import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen Bir Kelime Giriniz : ");
        String metin = girdi.nextLine();
        int altSinir = 0;
        int ustSinir = metin.length() - 1;
        boolean palindromeMu = true;
        while (altSinir < ustSinir) {
            if (metin.charAt(altSinir) != metin.charAt(ustSinir)) {
                palindromeMu = false;
                break;
            }
            altSinir++;
            ustSinir--;

        }
        if (palindromeMu == true) {
            System.out.println(metin + " Kelimesi Palindromedur.");
        } else System.out.println("Girdiğiniz Kelime Palindrome Değildir.");
    }
}

