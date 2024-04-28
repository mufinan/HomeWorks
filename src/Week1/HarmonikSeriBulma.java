package Week1;

import java.util.Scanner;

public class HarmonikSeriBulma {
    public static void main(String[] args) {

        //Kullanıcıdan veri alınır.
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int number = scan.nextInt();
        double toplam = 0;

        //1'den başlayıp n sayısına kadar döngü açılır.
        for(int i=1; i<=number; i++) toplam += (double) 1 / i; // 1/i miktarı genel toplama eklenir.

        System.out.println("Girilen sayının harmonik seri toplamı : " + toplam);
        scan.close();
    }
}
