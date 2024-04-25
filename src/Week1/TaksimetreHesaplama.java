package Week1;

import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {
        // Taksimetre hesaplıyorum.
        Scanner scanner = new Scanner(System.in);

        // Km bilgisini kullanıcıdan alıyoruz.
        System.out.print("Mesafeyi girin(Km): ");
        double mesafe = scanner.nextDouble();

        double birim = 2.20;
        int acilisUcreti = 10;
        double totalUcret = acilisUcreti + (birim * mesafe);
        double odenecekTutar = (totalUcret < 20) ? 20 : totalUcret;

        System.out.println("Taksimetre ücreti: " + odenecekTutar + " TL'dir.");
        // Taksimetre tutarını ekrana bastırıyoruz.

        scanner.close();
    }
}
