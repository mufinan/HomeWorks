package Week1;

import java.util.Scanner;

public class TipDonusumleri {
    public static void main(String[] args) {
        // Kullanıcıdan tam sayı ve ondalıklı sayı girişi alır
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir tam sayı girin: ");
        int tamSayi = inp.nextInt();
        System.out.print("Bir ondalıklı sayı girin: ");
        double ondalikliSayi = inp.nextDouble();

        // Tam sayıyı ondalıklı sayıya dönüştür
        double tamSayiToOndalikli = (double) tamSayi;

        // Ondalıklı sayıyı tam sayıya dönüştür
        int ondalikliSayiToTam = (int) ondalikliSayi;

        // Sonuçları ekrana yazdır
        System.out.println("Tam sayıyı ondalıklıya dönüştürme: " + tamSayiToOndalikli);
        System.out.println("Ondalıklı sayıyı tama dönüştürme: " + ondalikliSayiToTam);

        inp.close();
    }
}
