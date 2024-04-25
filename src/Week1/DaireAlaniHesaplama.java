package Week1;

import java.util.Scanner;

public class DaireAlaniHesaplama {
    public static void main(String[] args) {
        // Daire diliminin alanını hesaplıyorum.
        Scanner scanner = new Scanner(System.in);

        // Bilgileri kullanıcıdan alıyoruz.
        System.out.print("Daire yarıçapını girin : ");
        double r = scanner.nextDouble();

        System.out.print("Merkez açı ölçüsünü girin : ");
        double a = scanner.nextDouble();

        double pi= 3.14;
        double alan = (pi * (r*r) * a) / 360;

        System.out.println("Daire diliminin alanı : " + alan );
        // Daire dilimi alanını ekrana bastırıyoruz.

        scanner.close();
    }

}
