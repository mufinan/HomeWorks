package Week1;

import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        // Vücut kitle indeksi hesaplıyorum.
        Scanner scanner = new Scanner(System.in);

        // Bilgileri kullanıcıdan alıyoruz.
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo = scanner.nextDouble();

        //Kilo (kg) / Boy(m) * Boy(m)

        double vki = kilo / boy * boy;
        System.out.println("Vücut Kitle İndeksiniz : " + vki );
        // Vücut kitle indeksini ekrana bastırıyoruz.

        scanner.close();
    }
}
