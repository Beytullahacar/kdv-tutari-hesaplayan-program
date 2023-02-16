import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fiyat,kdvOrani,kdvliFiyat,kdvTutari;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen KDV'sini hesaplamak istediğiniz fiyatı giriniz : ");
        fiyat = input.nextDouble();

        kdvOrani = (fiyat>=0 && fiyat<=1000) ? 0.18 : 0.08;

        kdvTutari = fiyat*kdvOrani;
        kdvliFiyat = fiyat + kdvTutari;

        System.out.println("KDV'siz Fiyat : " + fiyat);
        System.out.println("KDV Oranı : " + kdvOrani);
        System.out.println("KDV'li Fiyat : " + kdvliFiyat);
        System.out.println("KDV Tutarı : " + kdvTutari);

    }
}