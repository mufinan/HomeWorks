package Week1;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        // Manav ürünleri toplam fiyatını hesaplıyorum.
        Scanner scanner = new Scanner(System.in);

        // Bilgileri kullanıcıdan alıyoruz.
        System.out.print("Armut Kaç Kilo ? : ");
        double armut = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        double elma = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        double domates = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        double muz = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        double patlican = scanner.nextDouble();

        double toplamTutar = (armut * 2.14) + (elma *3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5);

        String sonuc = String.format("%.2f", toplamTutar); // Tutarı küsüratı iki haneli olacak şekilde bastırdım.


        System.out.println("Toplam Tutar :" + sonuc + "TL");
        // Manav kasa toplam tutarını ekrana bastırıyoruz.

        scanner.close();
    }
}
