package Week1;

import java.util.Scanner;

public class UcgendeAlanHesaplama {
    public static void main(String[] args) {
        // Üç kenarı verilen bir üçgenin alanını hesaplıyorum.
        Scanner scanner = new Scanner(System.in);

        // Kenar uzunluklarını kullanıcıdan alıyoruz.
        System.out.print("Birinci kenarı tam sayı olarak girin: ");
        int a = scanner.nextInt();
        System.out.print("İkinci kenarı tam sayı olarak girin: ");
        int b = scanner.nextInt();
        System.out.print("Üçüncü kenarı tam sayı olarak girin: ");
        int c = scanner.nextInt();

        double u = (double) (a + b + c) /2;
        double alan = Math.sqrt(u * (u - a)* (u - b) * (u - c));

        System.out.println("Üçgenin Alanı: " + alan);
        // Üçgenin alanını ekrana bastırıyoruz.

        scanner.close();   // Kullanıcıdan veri almayı durduruyoruz.
    }
}
