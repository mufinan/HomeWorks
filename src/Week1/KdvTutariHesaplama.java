package Week1;
import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan giriş almak için değişken ataması yapıyoruz.

        System.out.print("Para miktarını girin: ");
        double para = scanner.nextDouble();       // Para miktarını kullanıcıdan alıyoruz.

        double kdvOrani = (para >= 0 && para <= 1000) ?  0.18  : 0.08; // Verilen koşulumuzu uyguluyoruz. Birden fazla değişken olduğu durumlarda if kullanabiliriz.

        double kdvTutari = para * kdvOrani;
        double kdvliFiyat = para + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + para);
        System.out.println("KDV Oranı: %" + (kdvOrani * 100));
        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        // Ekrana girilen bilgileri koşulumuzla entegre ederek ekrana bastırıyoruz.

        scanner.close();   // Kullanıcıdan veri almayı durduruyoruz.
    }
}

